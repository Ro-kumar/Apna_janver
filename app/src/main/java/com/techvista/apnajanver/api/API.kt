/*
 * *
 *  * Created by Rohan Programmer on 18/02/24, 6:42 pm
 *  * Copyright (c) 2024 . All rights reserved.
 *  * Last modified 18/02/24, 6:42 pm
 *
 */

package com.techvista.apnajanver.api

import com.techvista.apnajanver.models.Login.loginRequest
import com.techvista.apnajanver.models.Login.loginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface API {

//    @GET("/products")
//    suspend fun getProducts() : Response<List<ProductListItem>>


    @POST("login")
    suspend fun login(
        @Body request: loginRequest
    ):  Response<loginResponse>


}