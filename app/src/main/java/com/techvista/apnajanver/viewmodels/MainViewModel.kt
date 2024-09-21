/*
 * *
 *  * Created by Rohan Programmer on 18/02/24, 6:42 pm
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 18/02/24, 6:42 pm
 *
 */

package com.techvista.apnajanver.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.techvista.apnajanver.models.Login.loginRequest
import com.techvista.apnajanver.models.Login.loginResponse
import com.techvista.apnajanver.models.ProductListItem
import com.techvista.apnajanver.repository.Repository
import com.techvista.apnajanver.utils.NetworkResult
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    private val _products = MutableLiveData<NetworkResult<List<ProductListItem>>>()
    val products: LiveData<NetworkResult<List<ProductListItem>>>
    get() = _products


    private val _login= MutableLiveData<NetworkResult<loginResponse>>()
    val login: LiveData<NetworkResult<loginResponse>>
        get() = _login




//    fun getProducts(){
//        viewModelScope.launch {
//            val result = repository.getProducts()
//            _products.postValue(result)
//        }
//    }
    fun getlogin(loginRequest: loginRequest){
        viewModelScope.launch {
            val result = repository.getLogin(loginRequest)
            _login.postValue(result)
        }
    }
}