package msecilmis.com.mackoliktest.injection

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import msecilmis.com.mackoliktest.MainActivity
import msecilmis.com.mackoliktest.news.NewsFragment
import msecilmis.com.mackoliktest.scores.ScoresFragment
import msecilmis.com.mackoliktest.util.IFragmentNavigationSubject
import msecilmis.com.mackoliktest.util.INavigationManager
import msecilmis.com.mackoliktest.util.NavigationManager
import msecilmis.com.mackoliktest.util.Toaster

@Module
internal abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = arrayOf(HelperModule::class))
    internal abstract fun newsFragment(): NewsFragment

    @ContributesAndroidInjector(modules = arrayOf(HelperModule::class))
    internal abstract fun scoresFragment(): ScoresFragment

    @Binds
    @ActivityScope
    internal abstract fun bindActivity(activity: MainActivity): Activity

    @Binds
    @ActivityScope
    internal abstract fun bindNavSubject(activity: MainActivity): IFragmentNavigationSubject

    @Binds
    @ActivityScope
    abstract fun mainActivityNavigationManager(navigationManager: NavigationManager): INavigationManager

    @Module
    companion object {


        @Provides
        @ActivityScope
        fun provideToaster(activity: Activity): Toaster {
            return Toaster(activity)
        }
    }

}
