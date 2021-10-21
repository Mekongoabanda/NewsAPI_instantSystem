package com.example.newsapi_instantsystem.services

import com.example.newsapi_instantsystem.models.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

//Vous pouvez récupérer votre API key ici : https://newsapi.org/register (need to be log in)

interface NewsApiInterface{

    @GET("/v2/everything?q=bitcoin&apiKey=0bf5b909bced4b80ad1669e78754b254")
    fun getAllNewsList(): Call<NewsResponse> // return response call
}