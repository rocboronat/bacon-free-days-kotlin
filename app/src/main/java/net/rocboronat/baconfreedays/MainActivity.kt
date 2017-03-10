package net.rocboronat.baconfreedays

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), MainPresenter.View {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(
                this,
                LastBaconDate(
                        Clock(),
                        SharedPreferencesBaconRepository(
                                PreferenceManager.getDefaultSharedPreferences(this)
                        )))
        presenter.onCreate()
    }

    override fun updateLastBaconDate(lastBaconDate: Date) {
        lastBaconDateTextView.text = lastBaconDate.toString()
    }
}
