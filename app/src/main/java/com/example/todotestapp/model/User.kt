package com.example.todotestapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class User {
    @PrimaryKey(autoGenerate = false)
    var id :Int? = null
}