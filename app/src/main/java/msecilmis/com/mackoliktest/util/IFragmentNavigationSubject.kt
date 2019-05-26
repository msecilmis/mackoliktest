package msecilmis.com.mackoliktest.util

import android.support.annotation.IdRes
import android.support.v4.app.FragmentManager

interface IFragmentNavigationSubject {

    fun mainContentId(): Int

    fun supportFragmentManager(): FragmentManager
}
