package com.example.todotestapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.todotestapp.model.User

@Dao
public interface UserDao {

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertProducts(products :List<User>):List<Long>
//
    @Query("SELECT * FROM User where id = :id")
    suspend fun getUser(id:Int):User

    @Query("DELETE FROM User Where ")
    suspend fun getUser():User


}