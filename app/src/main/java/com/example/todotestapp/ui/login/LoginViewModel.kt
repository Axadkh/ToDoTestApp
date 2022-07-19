package com.sbp.assetManager.notfoundAssests

import androidx.lifecycle.ViewModel

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository :LoginRepo) :ViewModel() {

//    fun getUser(assetsNo:String): LiveData<User> {
//        return repository.getDataByAssetsNo(assetsNo)
//    }




}