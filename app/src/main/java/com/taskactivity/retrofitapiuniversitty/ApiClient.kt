package com.taskactivity.retrofitapiuniversitty
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {



        var BASE_URL:String="https://mysaving.in/IntegraAccount/api/"
    var retrofit:Retrofit?=null
    fun  getClient():Retrofit?{
        if (retrofit==null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }

    }

