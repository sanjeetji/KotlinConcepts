package com.sanjeet.kotlinconcepts.repository

import androidx.lifecycle.LiveData
import com.sanjeet.kotlinconcepts.database.AppDatabase
import com.sanjeet.kotlinconcepts.database.entity.PostItem
import javax.inject.Inject

class PostDBRepository @Inject constructor(
    private val appDatabase: AppDatabase
) {

    suspend fun insertAllPost(postItem:List<PostItem>):List<Long>{
        return appDatabase.postDao().insert(postItem)
    }

    // NOTE - Since we are already using LIVE-DATA no need to use suspend function
    val allPosts: LiveData<List<PostItem>> = appDatabase.postDao().getAllPost()
}