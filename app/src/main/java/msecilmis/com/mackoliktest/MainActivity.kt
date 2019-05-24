package msecilmis.com.mackoliktest

import android.content.Context
import android.content.res.Resources.Theme
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.ThemedSpinnerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup spinner
        spinner.adapter = MyAdapter(
                this,
                arrayOf("News", "Scores", "Standings"))

        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                // When the given dropdown item is selected, show its contents in the
                // container view.
                spinner.text1.text = ""

                var fragment: Fragment

                when (position) {
                    0 -> fragment = NewsFragment.newInstance()
                    1 -> fragment = ScoresFragment.newInstance()
                    2 -> return
                    else -> return
                }

                supportFragmentManager.beginTransaction()
                        .replace(R.id.container, fragment)
                        .commit()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                spinner.text1.text = ""
            }
        }

    }

    private class MyAdapter(context: Context, objects: Array<String>) : ArrayAdapter<String>(context, R.layout.list_item, objects), ThemedSpinnerAdapter {
        private val mDropDownHelper: ThemedSpinnerAdapter.Helper = ThemedSpinnerAdapter.Helper(context)

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

            return view
        }

        override fun getDropDownViewTheme(): Theme? {
            return mDropDownHelper.dropDownViewTheme
        }

        override fun setDropDownViewTheme(theme: Theme?) {
            mDropDownHelper.dropDownViewTheme = theme
        }
    }


}
