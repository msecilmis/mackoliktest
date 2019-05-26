package msecilmis.com.mackoliktest

import android.content.Context
import android.content.res.Resources
import android.support.v7.widget.ThemedSpinnerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_item.view.*

class MyAdapter(context: Context, val objects: Array<String>) :
    ArrayAdapter<String>(context, R.layout.list_item, objects),
    ThemedSpinnerAdapter {
    private val mDropDownHelper: ThemedSpinnerAdapter.Helper =
        ThemedSpinnerAdapter.Helper(context)

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View

        if (convertView == null) {
            // Inflate the drop down using the helper's LayoutInflater
            val inflater = mDropDownHelper.dropDownViewInflater
            view = inflater.inflate(R.layout.list_item, parent, false)
        } else {
            view = convertView
        }

        view.text1.text = getItem(position)

        var spinnerDivider: Int = if (position == objects.size - 1) {
            0
        } else {
            R.drawable.spinner_divider
        }

        view.text1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, spinnerDivider)

        return view
    }

    override fun getDropDownViewTheme(): Resources.Theme? {
        return mDropDownHelper.dropDownViewTheme
    }

    override fun setDropDownViewTheme(theme: Resources.Theme?) {
        mDropDownHelper.dropDownViewTheme = theme
    }
}