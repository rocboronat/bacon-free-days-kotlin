package net.rocboronat.baconfreedays

import java.util.*

interface BaconRepository {
    fun getLastBaconDate(): Date?
}