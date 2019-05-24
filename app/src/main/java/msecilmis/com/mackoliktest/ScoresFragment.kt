package msecilmis.com.mackoliktest


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ScoresFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scores, container, false)
    }

    companion object {
        fun newInstance(): ScoresFragment {
            return ScoresFragment()
        }
    }

}
