package msecilmis.com.mackoliktest.injection

import dagger.Module
import dagger.Provides
import msecilmis.com.mackoliktest.LoadingProgressBar
import msecilmis.com.mackoliktest.networking.*

@Module(subcomponents = arrayOf(StaticComponent::class))
class HelperModule {

    @Provides
    internal fun newsService(api: Api): INewsService {
        return NewsService(api)
    }

    @Provides
    internal fun scoresService(api: Api): IScoresService {
        return ScoresService(api)
    }

    @Provides
    internal fun loadingProgressBar(): LoadingProgressBar {
        return LoadingProgressBar()
    }

}
