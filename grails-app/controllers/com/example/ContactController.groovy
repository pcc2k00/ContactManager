//package com.example
//
//import grails.rest.RestfulController
//
//
//class ContactController extends RestfulController<Contact> {
//    static responseFormats = ['json', 'xml']
//
//    ContactController() {
//        super(Contact)
//    }
//
//    static scaffold = Contact
//
//    def index() {
////        def contacts = ContactDetail.ContactDetailService.listAllUsers()
////        [contacts: contacts]
//    }
//}

package com.example

import grails.validation.ValidationException
import org.springframework.security.core.authority.SimpleGrantedAuthority

import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured

class ContactController {

    ContactService contactService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond contactService.list(params), model:[contactCount: contactService.count()]
    }

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def show(Long id) {
        respond contactService.get(id)
    }

    @Secured('ROLE_ADMIN')
    def create() {
        respond new Contact(params)
    }

    @Secured('ROLE_ADMIN')
    def save(Contact contact) {
        if (contact == null) {
            notFound()
            return
        }

        try {
            contactService.save(contact)
        } catch (ValidationException e) {
            respond contact.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'contact.label', default: 'Contact'), contact.id])
                redirect contact
            }
            '*' { respond contact, [status: CREATED] }
        }
    }

    @Secured('ROLE_ADMIN')
    def edit(Long id) {
        respond contactService.get(id)
    }

    @Secured('ROLE_ADMIN')
    def update(Contact contact) {
        if (contact == null) {
            notFound()
            return
        }

        try {
            contactService.save(contact)
        } catch (ValidationException e) {
            respond contact.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'contact.label', default: 'Contact'), contact.id])
                redirect contact
            }
            '*'{ respond contact, [status: OK] }
        }
    }

    @Secured('ROLE_ADMIN')
    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        contactService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'contact.label', default: 'Contact'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

//    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
//    def search() {
//        // Extract search parameters from the request
//        String searchName = params.name
//        String searchEmail = params.email
//        String searchPhone = params.phone
//
//        // Build the query based on provided parameters
//        def query = Contact.createCriteria()
//        def results = query.list {
//            if (searchName) {
//                ilike("name", "%${searchName}%")
//            }
//           else if (searchEmail) {
//                ilike("email", "%${searchEmail}%")
//            }
//            else if (searchPhone) {
//                ilike("phone", "%${searchPhone}%")
//            }
//        }
////        params.max = Math.min(max ?: 10, 100)
////        respond contactService.list(params), model:[contactCount: contactService.count()]
//        // Respond with the search results
//        log.debug("Results type: ${results.class.name}, content: ${results}")
//        println(results)
////        respond results, model: [searchCount: results.size()]
//
//    }

    def searchResults() {
        render(view: 'searchResults', model: [searchResults: results])
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'contact.label', default: 'Contact'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}