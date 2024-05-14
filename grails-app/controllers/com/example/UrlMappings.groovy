package com.example

class UrlMappings {
    static mappings = {

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "/"(controller:"login", action: "auth")
//        "/contact/searchResults"(controller: "contact", action: "searchResults")
        "/search/"(controller: 'search', action: 'index')
        "/search/result"(controller: 'search', action: 'result')
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
