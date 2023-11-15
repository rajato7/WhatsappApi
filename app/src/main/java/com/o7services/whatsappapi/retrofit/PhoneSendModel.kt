package com.o7services.whatsappapi.retrofit

data class PhoneSendModel(
    var messaging_product: String?,
    var template: Template?,
    var to: String?,
    var type: String?
)