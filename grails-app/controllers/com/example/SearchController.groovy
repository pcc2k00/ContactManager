package com.example
import grails.plugin.springsecurity.annotation.Secured

class SearchController {

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def index() {
        render(view: "index")
    }

    @Secured(['ROLE_ADMIN', 'ROLE_USER'])
    def result() {
        // Extract search parameters from the request
        String searchName = params.name
        String searchEmail = params.email
        String searchPhone = params.phone

        // Build the query based on provided parameters
        def query = Contact.createCriteria()
        def results = query.list {
            if (searchName) {
                ilike("name", "%${searchName}%")
            }
            if (searchEmail) {
                ilike("email", "%${searchEmail}%")
            }
            if (searchPhone) {
                ilike("phone", "%${searchPhone}%")
            }
        }
        log.error("Results type: ${results.class.name}, content: ${results}")
        println(results)
//        respond results, result: [searchCount: results.size()]
        respond(results, [model: [result: results, searchCount: results.size()]])
    }
}
