package com.example.todotestapp.di

import android.content.Context
import androidx.room.Room
import com.example.todotestapp.db.TodoDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideDb(@ApplicationContext context: Context) :TodoDb{
       return Room.databaseBuilder(
            context.applicationContext,
           TodoDb::class.java, "AssetManagerDatabase"
        ).allowMainThreadQueries().build()
    }
}