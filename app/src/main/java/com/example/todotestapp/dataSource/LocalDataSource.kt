package com.example.todotestapp.dataSource

import com.example.todotestapp.db.TodoDb
import com.example.todotestapp.model.User
import javax.inject.Inject

class LocalDataSource @Inject constructor(val todoDb:TodoDb) {

//   suspend fun getProducts() = todoDb.userDao().getUser()
//    suspend fun saveUser(user: User) = todoDb.userDao().insetUser(user)
}