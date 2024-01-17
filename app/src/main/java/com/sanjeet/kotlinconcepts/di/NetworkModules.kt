package com.sanjeet.kotlinconcepts.di


import android.content.SharedPreferences
import com.sanjeet.kotlinconcepts.network.ApiService
import com.sanjeet.kotlinconcepts.utils.Constant.BASE_URL
import com.sanjeet.kotlinconcepts.utils.Constant.NEW_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModules {

    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

//    @Singleton
//    @Provides
//    fun provideHttpClient() = OkHttpClient.Builder()
//        .addInterceptor(Interceptor(){
//            val staticToken = "6945595921271780"
//
//            val newRequest = it.request().newBuilder()
//                .addHeader("Authorization","Bearer $staticToken")
//                .build()
//
//            it.proceed(newRequest)
//        })

    @Singleton
    @Provides
    fun provideConverterFactory(): GsonConverterFactory =
        GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)

}