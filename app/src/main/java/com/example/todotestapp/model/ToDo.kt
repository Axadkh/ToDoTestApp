package com.example.todotestapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ToDo {
    @PrimaryKey(autoGenerate = false)
    var id :Int? = null
}