package com.example.newsapi_instantsystem.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/*
*
*  THIS CLASS WILL PERMITE US TO GET THE RESPONSE EXPECTED OF REQUEST
*  ON DOIT POUVOIR RECUPERER LES DONNEES INDIQUEES DANS NEW.KT
*
* Link of News API : https://newsapi.org/docs/get-started
* */

@Parcelize
data class NewsResponse(
    @SerializedName("articles")
    val news : List<New> // List d'éléments (de nos News) ayant pour type notre classe new
) : Parcelable{
    constructor() : this(mutableListOf())
}