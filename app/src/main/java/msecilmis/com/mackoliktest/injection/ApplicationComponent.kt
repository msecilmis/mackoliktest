package msecilmis.com.mackoliktest.injection


import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import msecilmis.com.mackoliktest.MackolikApplication
import msecilmis.com.mackoliktest.networking.Api

import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ActivityBindingModule::class, MainModule::class))
interface ApplicationComponent : AndroidInjector<MackolikApplication> {

    fun api(): Api

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MackolikApplication>()
}
