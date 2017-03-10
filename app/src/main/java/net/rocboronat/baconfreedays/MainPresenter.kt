package net.rocboronat.baconfreedays

import java.util.*

class MainPresenter(val view: View, val lastBaconDate: LastBaconDate) {

    fun onCreate() {
        view.updateLastBaconDate(lastBaconDate.getLastBaconDate())
    }

    interface View {
        fun updateLastBaconDate(lastBaconDate: Date)
    }
}