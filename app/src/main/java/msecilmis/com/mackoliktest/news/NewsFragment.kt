package msecilmis.com.mackoliktest.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import msecilmis.com.mackoliktest.R
import msecilmis.com.mackoliktest.networking.INewsService
import javax.inject.Inject


class NewsFragment : Fragment() {

    @Inject
    lateinit var newsService: INewsService

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    companion object {
        fun newInstance(): NewsFragment {
            return NewsFragment()
        }
    }
}
