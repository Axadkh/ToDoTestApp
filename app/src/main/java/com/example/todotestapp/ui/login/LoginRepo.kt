package com.sbp.assetManager.notfoundAssests

import com.example.todotestapp.db.TodoDb
import com.example.todotestapp.db.UserDao
import javax.inject.Inject

class LoginRepo @Inject constructor( database:TodoDb) {


    private var dataDao: UserDao

    init {
        dataDao = database.userDao()

    }










}