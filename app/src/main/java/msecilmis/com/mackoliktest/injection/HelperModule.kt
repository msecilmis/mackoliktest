package msecilmis.com.mackoliktest.injection

import dagger.Module
import dagger.Provides
import msecilmis.com.mackoliktest.LoadingProgressBar
import msecilmis.com.mackoliktest.networking.Api
import msecilmis.com.mackoliktest.networking.INewsService
import msecilmis.com.mackoliktest.networking.NewsService

@Module(subcomponents = arrayOf(StaticComponent::class))
class HelperModule {

    @Provides
    internal fun newsService(api: Api): INewsService {
        return NewsService(api)
    }

    @Provides
    internal fun loadingProgressBar(): LoadingProgressBar {
        return LoadingProgressBar()
    }

}
