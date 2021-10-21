package com.example.newsapi_instantsystem.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/* CETTE CLASSE PERMET DE CONSTRUIRE NOTRE URL API DE BASE AVEC LA BIBLIOTHEQUE RETROFIT
*
* Dans NewsApiInterface.kt vous avez le complément de requête selon les paramètres que l'on veut indiquer
* */

class NewsApiService{

    companion object{
        private const val BASE_URL = "https://newsapi.org" // (Need to be login with API key, see NewsApiInterface.kt )
        private var retrofit : Retrofit? = null

        fun getInstance(): Retrofit{

            if (retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            }
            return retrofit!!

        }
    }
}