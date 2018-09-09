package com.example.hafidzniioman.footballclub.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.hafidzniioman.footballclub.R
import com.example.hafidzniioman.footballclub.R.id.*
import com.example.hafidzniioman.footballclub.data.Team
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

class MainAdapter(private val teams: List<Team>)
    :RecyclerView.Adapter<TeamViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(TeamUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindItem(teams [position])
    }

    override fun getItemCount(): Int = teams.size

}

class TeamUI : AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>): View {
        return with(ui){
            linearLayout {
                lparams(width =  matchParent, height = wrapContent)
                padding = dip(16)
                orientation = LinearLayout.VERTICAL

                textView {
                    id = R.id.team_id
                    textSize = 20f

                }.lparams{
                    margin = dip(15)
                }

                textView {
                    id = R.id.team_name
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }

                textView {
                    id = R.id.file_name
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }

                textView {
                    id = R.id.name_league
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }

                textView {
                    id = R.id.home_team
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }

                textView {
                    id = R.id.away_team
                    textSize = 16f
                }.lparams {
                    margin = dip(15)
                }
            }
        }
    }
}

class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val teamName: TextView = view.find(team_name)
    private val teamId: TextView = view.find(team_id)
    private val fileName: TextView = view.find(file_name)
    private val nameLeague: TextView = view.find(name_league)
    private val homeTeam: TextView = view.find(home_team)
    private val awayTeam: TextView = view.find(away_team)
    fun bindItem(teams: Team) {
        teamName.text = teams.teamName
        teamId.text = teams.teamId
        fileName.text = teams.fileName
        nameLeague.text = teams.nameLeague
        homeTeam.text = teams.homeTeam
        awayTeam.text = teams.awayTeam
    }
}