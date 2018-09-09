package com.example.hafidzniioman.footballclub

import java.net.URL

class ApiRespository {

    fun doRequest(url:String): String{
        return URL(url).readText()
    }
}