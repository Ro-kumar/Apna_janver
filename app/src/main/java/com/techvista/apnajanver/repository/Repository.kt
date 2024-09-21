/*
 * *
 *  * Created by Rohan Programmer on 18/02/24, 6:42 pm
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 18/02/24, 6:42 pm
 *
 */

package com.techvista.apnajanver.repository

import com.techvista.apnajanver.models.Login.loginRequest
import com.techvista.apnajanver.api.API
import com.techvista.apnajanver.models.Login.loginResponse
import com.techvista.apnajanver.utils.NetworkResult

class Repository(private val API: API) {

//    suspend fun getProducts(): NetworkResult<List<ProductListItem>> {
//        val response = API.getProducts()
//        return if (response.isSuccessful) {
//            val responseBody = response.body()
//            if (responseBody != null) {
//                NetworkResult.Success(responseBody)
//            } else {
//                NetworkResult.Error(response.message())
//            }
//        } else {
//            NetworkResult.Error(response.message())
//        }
//    }

   suspend fun getLogin(loginRequest: loginRequest): NetworkResult<loginResponse> {
        val response = API.login(loginRequest(loginRequest.email,loginRequest.password))
        return if (response.isSuccessful) {
            val responseBody = response.body()
            if (responseBody != null) {
                NetworkResult.Success(responseBody)
            } else {
                NetworkResult.Error(response.message())
            }
        } else {
            NetworkResult.Error(response.message())
        }
    }




}