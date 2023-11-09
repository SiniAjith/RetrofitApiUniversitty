package com.taskactivity.retrofitapiuniversitty

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Dao {
    @SerializedName( "name")
    @Expose
    private var name: String? = null

    @SerializedName("age")
    @Expose
    private var age: String? = null

    @SerializedName("address")
    @Expose
    private var address: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getAge(): String? {
        return age
    }

    fun setAge(age: String?) {
        this.age = age
    }

    fun getAddress(): String? {
        return address
    }

    fun setAddress(address: String?) {
        this.address = address
    }

}