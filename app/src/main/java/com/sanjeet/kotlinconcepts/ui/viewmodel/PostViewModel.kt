package com.sanjeet.kotlinconcepts.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sanjeet.kotlinconcepts.database.entity.PostItem
import com.sanjeet.kotlinconcepts.repository.PostDBRepository
import com.sanjeet.kotlinconcepts.repository.PostRepository
import com.sanjeet.kotlinconcepts.utils.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val postRepository: PostRepository,
    private val postDbRepository: PostDBRepository
): ViewModel() {


    lateinit var fetchAllLocalPosts : LiveData<List<PostItem>>

    private var _postResponse = MutableLiveData<NetworkResult<List<PostItem>>>()
    val postResponse: LiveData<NetworkResult<List<PostItem>>> = _postResponse

    private var _postSaveResponse = MutableLiveData<List<Long>>()
    val postSaveResponse: LiveData<List<Long>> = _postSaveResponse

    //Transaction data
     var transactionResponse = MutableLiveData<NetworkResult<String>>()
        get() = postRepository._transactionResponse

    init {
        fetchTransactionData()
        fetchAllPosts()
        fetchAllLocalPosts = postDbRepository.allPosts
    }

    private fun fetchTransactionData() {
        viewModelScope.launch {
            postRepository.getTransaction()
        }
    }

    private fun fetchAllPosts() {//
        viewModelScope.launch {
            postRepository.getAllPosts().collect {
                _postResponse.postValue(it)
            }
        }
    }


    fun savePostIntoLocalDb(postItem:List<PostItem>){
        viewModelScope.launch {
            _postSaveResponse.postValue(postDbRepository.insertAllPost(postItem))
        }
    }



}