package com.example.ContactDetail

import com.example.ContactDetail
import com.example.UserDetail
import groovy.transform.CompileStatic

@CompileStatic
class ContactDetailService {
    List<ContactDetail> listAllUsers() {
        return ContactDetail.list()
    }

    //At first initialized admin user data for logging as admin
    static initialize() {
        initUser()
    }

    private static initUser() {
        if (ContactDetail.count() == 0) {
            ContactDetail contact = new ContactDetail()
            contact.name = "admin"
            contact.phone = 9089892347
            contact.address = "5 Mockingbird Apt, Dallas, TX"
            contact.save(flash: true)
        }
    }
}
