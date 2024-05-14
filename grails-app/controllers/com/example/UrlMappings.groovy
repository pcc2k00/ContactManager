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
//        "/contact/search"(controller: 'contact', action: 'search')
        "500"(view:'/error')
        "404"(view:'/notFound')

    }
}
