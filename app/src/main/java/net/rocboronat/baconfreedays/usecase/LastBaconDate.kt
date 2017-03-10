package net.rocboronat.baconfreedays.usecase

import net.rocboronat.baconfreedays.repository.BaconRepository
import net.rocboronat.baconfreedays.infrastucture.Clock
import java.util.*

class LastBaconDate(val clock: Clock, val baconRepository: BaconRepository) {

    fun getLastBaconDate(): Date {
        return baconRepository?.getLastBaconDate() ?: clock.now()
    }
}
