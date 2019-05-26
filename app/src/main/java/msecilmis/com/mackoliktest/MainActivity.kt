package msecilmis.com.mackoliktest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*
import msecilmis.com.mackoliktest.util.IFragmentNavigationSubject
import msecilmis.com.mackoliktest.util.INavigationManager
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasSupportFragmentInjector,
    IFragmentNavigationSubject {

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var navigationManager: INavigationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner.adapter = MyAdapter(
            this,
            arrayOf("News", "Scores", "Standings")
        )

        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                spinner.text1.text = ""

                when (position) {
                    0 -> {
                        navigationManager.showNews()
                        return
                    }
                    1 -> {
                        navigationManager.showScores()
                        return
                    }
                    else -> return
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                spinner.text1.text = ""
            }
        }

    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    override fun mainContentId(): Int {
        return R.id.container
    }

    override fun supportFragmentManager(): FragmentManager {
        return supportFragmentManager
    }

}
