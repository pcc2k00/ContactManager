package com.example.UserDetail

import com.example.UserDetail
import groovy.transform.CompileStatic

@CompileStatic
class UserDetailService {

    List<UserDetail> listAllUsers() {
        return UserDetail.list()
    }

//     def saveUser(GrailsParameterMap params) {
//         User user = new User(params)
//        if (!User.findByEmail(user.email)) {
//            user.setPassword(user.passwordHash)
//            user.save()
//        } else {
//            throw new Exception("User already exists")
//        }
//    }

    //At first initialized admin user data for logging as admin
    static initialize() {
        initUser()
    }

    private static initUser() {
        if (UserDetail.count() == 0) {
            UserDetail user = new UserDetail()
            user.emailId = "admin@email.com"
            user.passwordHash = "admin"
            user.role = "admin"
            user.save(flash: true)
        }
    }
}
