package com.example

class BootStrap {
    def init = { servletContext ->
        def user = new User(username: "a", password: "a", email: "a@gmail.com").save()
        def admin = new Role(authority: 'ROLE_ADMIN').save()
        def instance = new UserRole(user: user, role: admin).save()
        new Role(authority: 'ROLE_USER').save()
    }
    def destroy = {
    }
}