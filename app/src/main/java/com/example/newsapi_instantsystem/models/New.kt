package com.example.newsapi_instantsystem.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/*
*
*  CETTE CLASSE PERMET DE DEFINIR LES VARIABLES QUE L'ON SOUHAITE RECUPERER
*
* lien vers News API : https://newsapi.org/docs/get-started
*
* So we can try to get an id, title, name, description, url and url for an image. We will be not obliget to use all datas
* */

// BECAREFUL : The name value of data must be the same as defined from the API.
//En fait nous allons "parser" l'API

@Parcelize
data class New(
    @SerializedName("author")
    val author : String ?,

    @SerializedName("title")
    val title : String ?,

    @SerializedName("description")
    val description : String ?,

    @SerializedName("url") // This URL is relative to current new url
    val url : String ?,

    @SerializedName("urlToImage") // This url is relative for image News
    val urlToImage : String ?,

    @SerializedName("publishedAt")
    val publishedAt : String ?,

) : Parcelable {
    constructor() : this ("","","", "", "", "" )
}