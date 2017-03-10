package net.rocboronat.baconfreedays.usecase

import net.rocboronat.baconfreedays.repository.BaconRepository
import net.rocboronat.baconfreedays.infrastucture.Clock

class UpdateBaconDate(val clock: Clock, val baconRepository: BaconRepository) {

    fun updateLastBaconDate() {
        baconRepository.updateBaconDate(clock.now())
    }
}