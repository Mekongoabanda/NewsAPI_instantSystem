package com.example.newsapi_instantsystem.Views

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapi_instantsystem.R
import com.example.newsapi_instantsystem.models.New
import java.net.URI

// ADAPTER OF NEW RECYCLER VIEW IN MainActivity.kt

internal class NewsAdapter(private val mNewsList : List<New>) : RecyclerView.Adapter<NewsAdapter.NewViewHolder>(){

     //todo : VARIABLES GLOBALES ICI
     //This variable below is relative to the layout that we must call (for this test, we have only one type view to show)
     private val DEFAULT_VIEW = 1

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {

         return if (viewType == DEFAULT_VIEW ){ //We call the news_item.XML (default_view)
             val v = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
             NewViewHolder(v)

         }else{

             val v = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
             NewViewHolder(v)
         }
     }

    // -------- This method permite us to init our widget (widget of news_item.XML)
    inner class NewViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var secondPartLayout : RelativeLayout? = null //Container of visisble element with default view (Image, title, author, publish_at)
        var firstPartLayout : RelativeLayout? = null //Second part visible when we click on view to have more details
        var titleArticle : TextView? = null
        var authorArticle : TextView? = null
        var dateArticle : TextView? = null
        var btnBlue1 : RelativeLayout? = null
        var btnBlue2 : RelativeLayout? = null
        var descriptionArticle : TextView? = null
        var linkArticle : TextView? = null
        var imageArticle : ImageView? = null
        var textID : TextView? = null
        var gif_click : ImageView? = null
        var cardGeneral : CardView? = null
        var layoutblue : RelativeLayout? = null


        init {

            secondPartLayout = view.findViewById(R.id.relative_secondPart) as RelativeLayout
            firstPartLayout = view.findViewById(R.id.relative_firstPart) as RelativeLayout
            titleArticle = view.findViewById(R.id.name_article) as TextView
            textID = view.findViewById(R.id.textID) as TextView
            authorArticle = view.findViewById(R.id.author_article) as TextView
            dateArticle = view.findViewById(R.id.date_article) as TextView
            btnBlue2 = view.findViewById(R.id.relativeBlue2) as RelativeLayout
            //btnBlue1 = findViewById(R.id.relativeBlue1) as RelativeLayout
            descriptionArticle = view.findViewById(R.id.description) as TextView
            linkArticle = view.findViewById(R.id.link_article) as TextView
            imageArticle = view.findViewById(R.id.image) as ImageView
            gif_click = view.findViewById(R.id.gif_click) as ImageView
            cardGeneral = view.findViewById(R.id.cardGeneral) as CardView
            layoutblue = view.findViewById(R.id.layoutblue) as RelativeLayout

        }

    }

    // There we can edit each view. to get position of certain view, we can use "psotion" parameter
     override fun onBindViewHolder(holder: NewViewHolder, position: Int) {

         // the part that contain description and link must be invisible
         holder.secondPartLayout!!.visibility = View.GONE
         holder.layoutblue!!.visibility = View.VISIBLE

         //Current new
         val currentNew = mNewsList[position]
        //Chargement de notre ressource d'animation
        val myanim = AnimationUtils.loadAnimation(holder.cardGeneral!!.context, R.anim.mytransition)

        //elements that are null as value are in red
        emptyViewAppareance(holder.titleArticle!!)
        emptyViewAppareance(holder.authorArticle!!)
        emptyViewAppareance(holder.dateArticle!!)
        emptyViewAppareance(holder.descriptionArticle!!)
        emptyViewAppareance(holder.linkArticle!!)

         // We pass the title, author, date, description, link and image (get from our API request)
         holder.titleArticle!!.text = currentNew.title
         holder.authorArticle!!.text = "Auteur : " + currentNew.author
         holder.dateArticle!!.text = "Publié le :" + currentNew.publishedAt
         holder.descriptionArticle!!.text = currentNew.description
         holder.linkArticle!!.text = currentNew.url
         holder.textID!!.text = (position + 1).toString()

         Glide.with(holder.gif_click!!.context).asGif().load(R.drawable.giphy).into(holder.gif_click!!)
        //Image of article
         Glide.with(holder.imageArticle!!.context).load(currentNew.urlToImage).centerCrop().into(holder.imageArticle!!)
         holder.imageArticle!!.startAnimation(myanim)

        //When we click on a view, the description and link must be appear in bottom of this one
         holder.cardGeneral!!.setOnClickListener(object : View.OnClickListener {

             override fun onClick(view: View?) {
                 if (holder.secondPartLayout!!.isVisible){


                     holder.secondPartLayout!!.startAnimation(myanim)

                     holder.secondPartLayout!!.visibility = View.GONE
                     holder.layoutblue!!.visibility = View.VISIBLE


                 }else {

                     holder.secondPartLayout!!.startAnimation(myanim)
                     holder.secondPartLayout!!.visibility = View.VISIBLE
                 }
             }

         })

         //When we click on the link we can open it on browser
         holder.linkArticle!!.setOnClickListener(object : View.OnClickListener {

             override fun onClick(view: View?) {
                 // call method to Parse Url String to URI and open it
                 goToUrl(holder.linkArticle!!.text.toString(), holder.linkArticle!!.context)


             }

         })



     }

     override fun getItemCount(): Int {
         return mNewsList.size
     }

    // METHOD Parse Url String to URI and open it, take string link and context in parameter
    fun goToUrl(link : String, ctx: Context){

        var uri : Uri = Uri.parse(link)
        var intent = Intent(Intent.ACTION_VIEW, uri)
        ctx.startActivity(intent)
    }

    @SuppressLint("ResourceAsColor")
    fun emptyViewAppareance(view : TextView?){

        if( view!!.text.equals("null")){

            view.setTextColor(ContextCompat.getColor(view.context, R.color.red_sang))
        }
    }


 }

