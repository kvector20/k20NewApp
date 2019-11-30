package com.kVectorFoundation.KV.ViewModel

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//fixed RetrofitAPI
open class RetrofitAPI {
    private val baseUrl = "kvectorfoundation.com/"

    private val moshi: Moshi = Moshi.Builder().build()
    fun getRetrofit(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

}

