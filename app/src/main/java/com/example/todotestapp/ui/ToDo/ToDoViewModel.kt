package com.example.todotestapp.ui.ToDo

import androidx.lifecycle.ViewModel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ToDoViewModel @Inject constructor(private val repository :ToDoRepo) :ViewModel() {

//    fun getUser(assetsNo:String): LiveData<User> {
//        return repository.getDataByAssetsNo(assetsNo)
//    }




}