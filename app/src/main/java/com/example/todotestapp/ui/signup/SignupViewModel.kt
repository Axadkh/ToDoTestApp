package com.example.todotestapp.ui.signup

import androidx.lifecycle.ViewModel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(private val repository :SignUpRepo) :ViewModel() {

//    fun getUser(assetsNo:String): LiveData<User> {
//        return repository.getDataByAssetsNo(assetsNo)
//    }




}