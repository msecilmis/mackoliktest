package msecilmis.com.mackoliktest.util

import android.support.v4.app.FragmentManager

class NavigationManager(private val navSubject: IFragmentNavigationSubject) : INavigationManager {

    private val supportFragmentManager: FragmentManager = navSubject.supportFragmentManager()

    override fun showNews() {
        val supportFragmentManager = this.supportFragmentManager
        //        supportFragmentManager.popBackStackImmediate(HomeFragment.TAG, 0);
        supportFragmentManager.popBackStackImmediate("", 0)
    }

    override fun showScores() {
        //        supportFragmentManager.beginTransaction()
        //                .addToBackStack(DetailsFragment.TAG)
        //                .replace(navSubject.getMainContentId(),
        //                        DetailsFragment.newInstance(),
        //                        DetailsFragment.TAG)
        //                .commitAllowingStateLoss();
    }

}
