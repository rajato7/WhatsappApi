package com.o7services.whatsappapi.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClass {
    lateinit var retrofit: Retrofit
    fun retrofitFunction() {
        var retro = Retrofit.Builder()
            .baseUrl("https://graph.facebook.com/"+"v17.0")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient().newBuilder().addInterceptor(MyInterceptor()).build())
            .build()
    }
}