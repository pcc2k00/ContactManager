package com.example

class UserDetailController {
//    UserDetailService userDetailService
    static scaffold = UserDetail  // Or any other domain class such as "Author", "Publisher"
    def index() {
        def users = UserDetailService.listAllUsers()
        [users: users]
    }


    def updateUser(Long id) {
//        userDetailService.updateUser(id, 'New Name')
        redirect(action: 'index')
    }
}