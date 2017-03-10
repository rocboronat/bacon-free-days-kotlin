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

        val clock = Clock();
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        val repository = SharedPreferencesBaconRepository(prefs)

        presenter = MainPresenter(
                this,
                LastBaconDate(clock, repository),
                UpdateBaconDate(clock, repository))
        presenter.onCreate()

        updateBaconDateButton.setOnClickListener { presenter.onUpdateDateButtonClicked() }
    }

    override fun updateLastBaconDate(lastBaconDate: Date) {
        lastBaconDateTextView.text = lastBaconDate.toString()
    }
}
