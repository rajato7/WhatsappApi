package com.o7services.whatsappapi.retrofit

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiInterface {
    @POST("FROM_PHONE_NUMBER_ID/messages")
    open fun sendMessage(@Body phoneSendModel: PhoneSendModel?): Call<PhoneSendModel?>?
}
