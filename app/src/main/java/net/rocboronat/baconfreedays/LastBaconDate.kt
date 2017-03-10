package net.rocboronat.baconfreedays

import java.util.*

class LastBaconDate(val clock: Clock, val baconRepository: BaconRepository) {

    fun getLastBaconDate(): Date {
        return baconRepository?.getLastBaconDate() ?: clock.now()
    }
}
