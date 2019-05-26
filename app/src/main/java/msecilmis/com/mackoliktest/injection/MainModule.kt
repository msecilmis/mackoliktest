package msecilmis.com.mackoliktest.injection


import android.app.Activity
import android.content.ClipboardManager
import android.content.Context
import android.view.inputmethod.InputMethodManager
import dagger.Binds
import dagger.Module
import dagger.Provides
import msecilmis.com.mackoliktest.MackolikApplication

import javax.inject.Singleton

@Module(subcomponents = arrayOf(StaticComponent::class), includes = arrayOf(NetworkingModule::class))
abstract class MainModule {

    @Binds
    internal abstract fun provideAppContext(application: MackolikApplication): Context

    @Module
    companion object {
        @Provides
        @Singleton
        internal fun clipboardManager(app: MackolikApplication): ClipboardManager {
            return app.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        }

        @Provides
        @Singleton
        internal fun inputMethodManager(app: MackolikApplication): InputMethodManager {
            return app.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        }
    }

    //    @Binds
    //    @Singleton
    //    abstract INewsService newsService(NewsService authSvc);

    //    @Binds
    //    @Singleton
    //    abstract IMessagingManager provideMessagingManager(MessagingManager messagingManager);

}
