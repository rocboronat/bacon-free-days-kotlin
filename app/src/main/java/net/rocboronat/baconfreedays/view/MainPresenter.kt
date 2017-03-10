package net.rocboronat.baconfreedays.view

import net.rocboronat.baconfreedays.usecase.LastBaconDate
import net.rocboronat.baconfreedays.usecase.UpdateBaconDate
import java.util.*

class MainPresenter(val view: View,
                    val lastBaconDate: LastBaconDate,
                    val updateBaconDate: UpdateBaconDate) {

    fun onCreate() {
        updateLastBaconDate()
    }

    fun onUpdateDateButtonClicked() {
        updateBaconDate.updateLastBaconDate()
        updateLastBaconDate()
    }

    private fun updateLastBaconDate() {
        view.updateLastBaconDate(lastBaconDate.getLastBaconDate())
    }

    interface View {
        fun updateLastBaconDate(lastBaconDate: Date)
    }

}