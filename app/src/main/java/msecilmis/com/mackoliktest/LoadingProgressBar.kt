package msecilmis.com.mackoliktest

import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LoadingProgressBar : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.loading_progress_bar, container, false)
        val dialog = dialog ?: return inflate

        val window = dialog.window ?: return inflate

        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        isCancelable = false
        return inflate
    }

    override fun dismiss() {
        // see dismissAllowingStateLoss
        if (fragmentManager == null) {
            return
        }

        super.dismiss()
    }

    override fun onDismiss(dialog: DialogInterface?) {
        // see dismissAllowingStateLoss
        if (fragmentManager == null) {
            return
        }

        super.onDismiss(dialog)
    }

    override fun dismissAllowingStateLoss() {
        // If we didn't show this DialogFragment before, fragment manager must be null.
        // Thus we have not yet shown this fragment.
        // You cannot dismiss what you cannot see.

        if (fragmentManager == null) {
            return
        }

        super.dismissAllowingStateLoss()
    }

    override fun show(manager: FragmentManager, tag: String) {
        if (isAdded)
            return

        super.show(manager, tag)
    }
}
