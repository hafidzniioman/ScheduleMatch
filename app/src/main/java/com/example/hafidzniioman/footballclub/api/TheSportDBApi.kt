package com.example.hafidzniioman.footballclub.api

import android.net.Uri
import com.example.hafidzniioman.footballclub.BuildConfig

object TheSportDBApi {
    fun getTeams(league: String?): String{
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath("1")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("eventsnextleague.php")
                .appendQueryParameter("id", league)
                .build()
                .toString()
    }
}