package com.example.todotestapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todotestapp.Utils.Constants
import com.example.todotestapp.model.ToDo
import com.example.todotestapp.model.User

@Database(entities = [User::class,ToDo::class], version = Constants.DB_VERSION)
abstract class TodoDb: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun ToDoDao(): ToDoDao

}