package com.sanjeet.kotlinconcepts.network

import com.sanjeet.kotlinconcepts.database.entity.PostItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<List<PostItem>>

    @POST("transaction?tid=2290041788&disablePrinting=false")
    suspend fun readTransactionStatus() :Response<String>
}