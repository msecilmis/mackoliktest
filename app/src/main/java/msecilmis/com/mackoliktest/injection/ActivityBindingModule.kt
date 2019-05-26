package msecilmis.com.mackoliktest.injection


import dagger.Module
import dagger.android.ContributesAndroidInjector
import msecilmis.com.mackoliktest.MainActivity

@Module
internal abstract class ActivityBindingModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    internal abstract fun mainActivity(): MainActivity
}
