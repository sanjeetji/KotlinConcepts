package com.sanjeet.kotlinconcepts.network

import com.sanjeet.kotlinconcepts.database.entity.PostItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): Response<List<PostItem>>
}