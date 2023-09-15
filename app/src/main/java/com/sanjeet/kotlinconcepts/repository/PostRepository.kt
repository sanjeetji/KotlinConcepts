package com.sanjeet.kotlinconcepts.repository

import com.sanjeet.kotlinconcepts.database.entity.PostItem
import com.sanjeet.kotlinconcepts.network.ApiService
import com.sanjeet.kotlinconcepts.utils.BaseApiResponse
import com.sanjeet.kotlinconcepts.utils.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val apiService: ApiService
): BaseApiResponse() {

    suspend fun getAllPosts(): Flow<NetworkResult<List<PostItem>>> {
        return flow<NetworkResult<List<PostItem>>> {
            emit(safeApiCall { apiService.getPosts() })
        }.flowOn(Dispatchers.IO)
    }
}