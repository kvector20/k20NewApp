package com.kVectorFoundation.KV.ViewModel


object ApiUtil : RetrofitAPI() {

    fun getServiceClass(): RetrofitInterface {
        return getRetrofit()?.create(RetrofitInterface::class.java)!!
    }

}
