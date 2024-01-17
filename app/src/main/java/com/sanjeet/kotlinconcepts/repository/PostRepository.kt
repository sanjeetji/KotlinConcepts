package com.sanjeet.kotlinconcepts.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sanjeet.kotlinconcepts.database.entity.PostItem
import com.sanjeet.kotlinconcepts.network.ApiService
import com.sanjeet.kotlinconcepts.utils.BaseApiResponse
import com.sanjeet.kotlinconcepts.utils.NetworkResult
import com.swoopos.kiosk.network.PaxApiModule
import com.swoopos.kiosk.network.PaxApiService
import com.swoopos.kiosk.paxpayment.PaxSaleRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.http.Url
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val apiService: ApiService,
    private val paxApiService: PaxApiService
): BaseApiResponse() {

    suspend fun getAllPosts(): Flow<NetworkResult<List<PostItem>>> {
        return flow<NetworkResult<List<PostItem>>> {
            emit(safeApiCall { apiService.getPosts() })
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getTransactionData() : Flow<NetworkResult<String>>{
        return flow<NetworkResult<String>> {
            emit(safeApiCall { apiService.readTransactionStatus() })
        }.flowOn(Dispatchers.IO)
    }


    public var _transactionResponse = MutableLiveData<NetworkResult<String>>()
    val transactionResponse: LiveData<NetworkResult<String>> = _transactionResponse

    suspend fun getTransaction() /*: Flow<NetworkResult<String>>*/{
        val pax = PaxSaleRequest(1761,"49176","SALE","30e70ee4-3e5a-46cc-a1a2-2da7e3e28863")

        val data = flow<NetworkResult<String>> {
            emit(safeApiCall { paxApiService.paxSaleRequest("6945595921271780","https://192.168.1.11:8080/POSitiveWebLink/1.1.0/rest/transaction?tid=2290041788&disablePrinting=false",pax) })
        }.flowOn(Dispatchers.IO)

        data.collect{
            _transactionResponse.postValue(it)
        }
    }
}