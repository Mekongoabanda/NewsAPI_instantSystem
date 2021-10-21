package com.example.newsapi_instantsystem.Views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapi_instantsystem.R
import com.example.newsapi_instantsystem.models.New
import com.example.newsapi_instantsystem.models.NewsResponse
import com.example.newsapi_instantsystem.services.NewsApiInterface
import com.example.newsapi_instantsystem.services.NewsApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private var countArticle : TextView? = null
    private var progressbar : ProgressBar? = null
    //For our recyclerView
    private var mLayoutManager : LinearLayoutManager? = null
    private var recyclerView : RecyclerView? = null
    private var mNewAdapter : NewsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 --- method that permite us to make link with this code and our view ---
        setupUI()
        // 2 --- Initialisation of our recyclerView
        setupRecyclerView()
        // 3 --- With MovieAdapter we can get a list of
        showNews()
    }


    //initialisation of our UiViews
    private fun setupUI() {

        countArticle = findViewById(R.id.countArticle) as TextView
        recyclerView = findViewById(R.id.recyclerview) as RecyclerView
        progressbar = findViewById(R.id.progressbar) as ProgressBar

    }

    //RecyclerView init
    private fun setupRecyclerView() {
        recyclerView!!.setHasFixedSize(true)
        //Initialisation de notre layout manager (vertical direction)
        mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView!!.layoutManager = mLayoutManager
    }

    //SHOWING of new calling API REST and the list return buy our adapter class
    private fun showNews() {

        getNewData { news: List<New> ->
            mNewAdapter = NewsAdapter(news)
            recyclerView!!.adapter = mNewAdapter
            mNewAdapter!!.notifyDataSetChanged()
            progressbar!!.visibility  = View.INVISIBLE

            countArticle!!.text = "Everything (" + (news.size.toString()) + ")"


        }


    }

    private fun getNewData(callback: (List<New>) -> Unit ){

        val apiService = NewsApiService.getInstance().create(NewsApiInterface::class.java)
        //On initialise notre var qui récupera la réponse de notre API
        lateinit var ApiToCall : Call<NewsResponse>

        //We send the request @GET in NewsApiInterface.kt calling the method getAllNewList()
        ApiToCall = apiService.getAllNewsList()

            ApiToCall.enqueue(object : Callback<NewsResponse> {
                override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {

                    try {
                        //On récupère va récupérer le resultat
                        return callback(response.body()!!.news)
                    }catch (e : Exception){
                        Toast.makeText(this@MainActivity, e.message, Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {

                    Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_LONG).show()
                }


            })




    }
}