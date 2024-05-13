package com.example

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class UserDetail {
    String emailId
    String passwordHash
    String role

    static constraints = {
        emailId(blank: false, unique: true, email: true)
        passwordHash(blank: false)
        role(inList: ['user', 'admin'])
    }

//    static mapping = {
//        passwordHash column: 'password_hash'
//    }

//    void setPassword(String password) {
//        this.passwordHash = new BCryptPasswordEncoder().encode(password)
//    }
}
