package com.kVectorFoundation.KV.ViewModel

import com.example.kvapp.model.magazineModel
import retrofit2.Call
import retrofit2.http.*


interface RetrofitInterface {
    @GET("api/magazine")
    fun allMag(): Call<magazineModel>

    @GET("api/magazine/{id}")
    fun singleMag(@Path("id") id: Int): Call<magazineModel>

    @POST("api/magazine/create")
    fun addMa(): Call<magazineModel>

    @PUT("api/magazine/update/{id}")
    fun editMag(@Path("id") id: Int): Call<magazineModel>

    @DELETE("api/magazine/delete/{id}")
    fun deleteMag(@Path("id") id: Int): Call<magazineModel>

}