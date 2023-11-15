package com.o7services.whatsappapi

import android.os.Bundle
import android.telecom.Call
import androidx.appcompat.app.AppCompatActivity
import com.o7services.whatsappapi.databinding.ActivityMainBinding
import com.o7services.whatsappapi.retrofit.ApiInterface
import com.o7services.whatsappapi.retrofit.Language
import com.o7services.whatsappapi.retrofit.PhoneSendModel
import com.o7services.whatsappapi.retrofit.RetrofitClass
import com.o7services.whatsappapi.retrofit.Template

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
     lateinit var retrofitClass: RetrofitClass
     lateinit var apiInterface: ApiInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {
            if(binding.etMessage.text.toString().isEmpty()){
                binding.etMessage.error = "Enter Message"
            }else if(binding.etAddNumber.text.toString().isEmpty()){
                binding.etAddNumber.error = "Enter Number to send message"
            }else{
                var sendModel =
                    PhoneSendModel(messaging_product = "whatsapp", type ="template", to =binding.etAddNumber.text.toString() , template =
                    Template(language = Language(code = "en"), name =binding.etMessage.text.toString()))
                retrofitClass = retrofitClass.retrofit.create(RetrofitClass::class.java)
                val call: Call<PhoneSendModel> = apiInterface.sendMessage(sendModel)

            }
        }
    }
}