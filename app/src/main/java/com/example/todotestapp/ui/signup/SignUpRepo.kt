package com.example.todotestapp.ui.signup

import com.example.todotestapp.db.TodoDb
import com.example.todotestapp.db.UserDao
import javax.inject.Inject

class SignUpRepo @Inject constructor(database:TodoDb) {


    private var dataDao: UserDao

    init {
        dataDao = database.userDao()

    }










}