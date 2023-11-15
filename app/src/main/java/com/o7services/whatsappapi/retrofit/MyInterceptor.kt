package com.o7services.whatsappapi.retrofit

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class MyInterceptor() :Interceptor {
    lateinit var request: Request
    override fun intercept(chain: Interceptor.Chain): Response {
       request = chain.request()
        var newRequest = request.newBuilder()
            .header("Authorization","Bearer EAAEKyMgbEJ0BO99E3bZCfyFcugEc6imC90ZBZAlMWZCZBHK17OZBceHSX42hOe30GE0gjXLc1evEeJyY4j2gQaddtIXQneBUD0quPpAEXJaeNwwtRdodH3NePKwZBcDrTAtcerDNSaBdZANfxwtFbCnVYQZCP3qJ2sKl49GEyhCDN9czSjH80fYquZAS3H8jFyWxdbWAgvTiFLGBwUKDBXBuQZD")
            .header("Content-Type","application/json")
            .build()

        return chain.proceed(newRequest)

    }
}