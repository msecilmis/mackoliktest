package msecilmis.com.mackoliktest.news

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_detail_dialog.view.*
import msecilmis.com.mackoliktest.R

class NewsDetailFragment : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflate = inflater.inflate(R.layout.news_detail_dialog, container, false)
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return inflate
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arguments = arguments ?: return

        val url = arguments.getString("url", null) ?: return

        view.webview.settings.javaScriptEnabled = true
        view.webview.loadUrl(url)

        view.rl_root.setOnClickListener { dismissAllowingStateLoss() }
    }

    companion object {

        fun newInstance(url: String): NewsDetailFragment {
            val args = Bundle()
            args.putString("url", url)
            val fragment = NewsDetailFragment()
            fragment.arguments = args
            return fragment
        }
    }

}
