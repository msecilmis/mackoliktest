package msecilmis.com.mackoliktest.scores

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.news_item.view.*
import kotlinx.android.synthetic.main.scores_item.view.*
import msecilmis.com.mackoliktest.R

class ScoresAdapter(val matchViewModels: List<MatchViewModel>) :
    RecyclerView.Adapter<ScoresAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.scores_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return matchViewModels.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val matchViewModel = matchViewModels.get(position)

        viewHolder.tvTeamAName.text = matchViewModel.teamAName
        viewHolder.tvTeamBName.text = matchViewModel.teamBName
        viewHolder.tvScore.text = matchViewModel.teamAScore + " - " + matchViewModel.teamBScore

        var backgroundColor: Int
        if (position % 2 == 0) {
            backgroundColor = Color.parseColor("#FFFFFF")
        } else {
            backgroundColor = Color.parseColor("#cfcfcf")
        }

        viewHolder.rlRoot.setBackgroundColor(backgroundColor)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTeamAName: TextView = itemView.tv_team_a_name
        val tvTeamBName: TextView = itemView.tv_team_b_name
        val tvScore: TextView = itemView.tv_score
        val rlRoot: RelativeLayout = itemView.rl_root
    }
}