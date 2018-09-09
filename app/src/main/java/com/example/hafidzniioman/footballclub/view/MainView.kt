package com.example.hafidzniioman.footballclub.view

import com.example.hafidzniioman.footballclub.data.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}