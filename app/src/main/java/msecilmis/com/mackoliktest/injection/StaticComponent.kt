package msecilmis.com.mackoliktest.injection

import dagger.Subcomponent

@Subcomponent(modules = arrayOf(StaticModule::class))
interface StaticComponent {

    @Subcomponent.Builder
    interface Builder {
        fun staticModule(staticModule: StaticModule): Builder

        fun build(): StaticComponent
    }
}
