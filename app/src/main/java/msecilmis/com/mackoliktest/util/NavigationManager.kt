package msecilmis.com.mackoliktest.util

import android.support.v4.app.FragmentManager
import msecilmis.com.mackoliktest.R
import msecilmis.com.mackoliktest.news.NewsFragment
import msecilmis.com.mackoliktest.scores.ScoresFragment
import javax.inject.Inject

class NavigationManager @Inject constructor(private val navSubject: IFragmentNavigationSubject) : INavigationManager {

    private val supportFragmentManager: FragmentManager = navSubject.supportFragmentManager()

    override fun showNews() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NewsFragment.newInstance())
            .commit()
    }

    override fun showScores() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, ScoresFragment.newInstance())
            .commit()
    }

}
