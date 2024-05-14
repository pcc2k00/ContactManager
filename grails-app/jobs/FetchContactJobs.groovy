package com.example

import grails.gorm.transactions.Transactional
import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.JSON

class FetchContactsJob {

    static triggers = {
        simple name:'simpleTrigger', startDelay: 0, repeatInterval: 10000, repeatCount: 0
    }

    @Transactional
    def execute() {
        try {
            int pageSize = 100
            RESTClient client = new RESTClient('https://randomuser.me/')
            def response = client.get(path: 'api', query: [results: pageSize, inc: 'name,email,location,phone'])

            if (response.status == 200) {

                def contacts = response.data.results
                contacts.each { result ->
                    try {
                        new Contact(
                                name: "${result.name.first} ${result.name.last}",
                                email: result.email,
                                phone: result.phone,
                                address: "${result.location.street.name}, ${result.location.city}, ${result.location.state}, ${result.location.country}"
                        ).save(failOnError: true, flush: true)
                    } catch (Exception e) {
                        log.error("Exception Error: Unable to save contact - ${e.message}")
                    }
                }
                println("Fetched contacts: ${contacts.size()}")
            } else {
                println("Failed to fetch contacts. Status: ${response.status}")
            }
        } catch (Exception e) {
            println("An error occurred while fetching contacts: ${e.message}")
        }
    }
}
