package com.o7services.whatsappapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.o7services.whatsappapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
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

            }
        }
    }
}