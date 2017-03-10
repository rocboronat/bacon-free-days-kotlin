package net.rocboronat.baconfreedays

class UpdateBaconDate(val clock: Clock, val baconRepository: BaconRepository) {

    fun updateLastBaconDate() {
        baconRepository.updateBaconDate(clock.now())
    }
}