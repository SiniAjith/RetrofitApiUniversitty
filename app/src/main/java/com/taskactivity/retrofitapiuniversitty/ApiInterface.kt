package com.taskactivity.retrofitapiuniversitty

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("myaddresssample.php")
    fun getdata(@Query(value = "key")s:String): Call<List<Dao>>
}