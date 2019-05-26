package msecilmis.com.mackoliktest.util

import android.support.annotation.IdRes
import android.support.v4.app.FragmentManager

interface IFragmentNavigationSubject {

    @get:IdRes
    abstract val mainContentId: Int

    fun supportFragmentManager(): FragmentManager
}
