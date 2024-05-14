package com.example

import grails.rest.Resource

//@Resource(uri='/contact_details')
class Contact {
    String name
    String email
    String phone
    String address

    static constraints = {
        name nullable: false, blank: false
        email nullable: false, email: true
        phone nullable: false, maxSize: 15
        address maxSize: 255
    }

    static mapping = {
        name index: 'idx_name'
        email index: 'idx_email'
        phone index: 'idx_phone'
    }

    String toString() {
        name
    }
}