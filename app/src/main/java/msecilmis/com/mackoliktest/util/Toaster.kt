package msecilmis.com.mackoliktest.util


import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

import javax.inject.Inject
import java.lang.ref.WeakReference


class Toaster @Inject
constructor(context: Context) {
    private val contextWeakReference: WeakReference<Context> = WeakReference(context)

    fun toast(text: CharSequence, duration: Int) {
        val context = contextWeakReference.get() ?: return

        Toast.makeText(context, text, duration).show()
    }

    fun toast(@StringRes resId: Int, duration: Int) {
        val context = contextWeakReference.get() ?: return

        Toast.makeText(context, resId, duration).show()
    }

    fun shortToast(s: String) {
        toast(s, Toast.LENGTH_SHORT)
    }


    fun shortToast(@StringRes resId: Int) {
        toast(resId, Toast.LENGTH_SHORT)
    }

    fun longToast(s: String) {
        toast(s, Toast.LENGTH_LONG)
    }


    fun longToast(@StringRes resId: Int) {
        toast(resId, Toast.LENGTH_LONG)
    }


}
