package msecilmis.com.mackoliktest.news

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.news_item.view.*
import msecilmis.com.mackoliktest.R

class NewsAdapter(val newsItemViewModels: List<NewsItemViewModel>, val picasso: Picasso) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsItemViewModels.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val newsItemViewModel = newsItemViewModels.get(position)

        viewHolder.tvTitle.text = newsItemViewModel.title
        viewHolder.tvPubDate.text = newsItemViewModel.pubDate
        picasso.load(newsItemViewModel.imageUrl).into(viewHolder.ivNews)


        var dividerVisibility: Int = if (position == (newsItemViewModels.size - 1)) {
            View.GONE
        } else {
            View.VISIBLE
        }

        viewHolder.divider.visibility = dividerVisibility
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivNews: ImageView = itemView.iv_news_item
        val tvTitle: TextView = itemView.tv_news_item_title
        val tvPubDate: TextView = itemView.tv_news_item_date
        val divider: View = itemView.divider
    }
}