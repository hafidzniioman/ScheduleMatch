package com.example.hafidzniioman.footballclub.data

import com.google.gson.annotations.SerializedName

data class Team (
        @SerializedName("idEvent")
        var teamId: String? = null,

        @SerializedName("strEvent")
        var teamName: String? = null,

        @SerializedName("strFilename")
        var fileName: String? = null,

        @SerializedName("strLeague")
        var nameLeague: String? = null,

        @SerializedName("strHomeTeam")
        var homeTeam: String? = null,

        @SerializedName("strAwayTeam")
        var awayTeam: String? = null
)