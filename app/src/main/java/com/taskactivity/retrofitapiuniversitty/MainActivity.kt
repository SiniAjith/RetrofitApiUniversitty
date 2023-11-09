package com.taskactivity.retrofitapiuniversitty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.taskactivity.retrofitapiuniversitty.R.id.t1

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card)

        var t1=findViewById<TextView>(R.id.t1)
        var t2=findViewById<TextView>(R.id.t2)
        var t3=findViewById<TextView>(R.id.t3)

val apiInterface=ApiClient.getClient()!!.create(ApiInterface::class.java)
        val call: Call<List<Dao>> = apiInterface.getdata(getString(taskId))
        call.enqueue(object:Callback<List<Dao>>{
            override fun onResponse(call: Call<List<Dao>>, response: Response<List<Dao>>) {
                t1.text= response.body()?.get(0)?.getName()
                t2.text= response.body()?.get(0)?.getAddress()
                t3.text= response.body()?.get(0)?.getAge()

            }

            override fun onFailure(call: Call<List<Dao>>, t: Throwable) {



            }

        })
    }
}