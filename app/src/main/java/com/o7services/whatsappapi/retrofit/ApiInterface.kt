package com.o7services.whatsappapi.retrofit

import retrofit2.http.POST

interface ApiInterface {

    @POST("send")
    fun sendMessage()

}
