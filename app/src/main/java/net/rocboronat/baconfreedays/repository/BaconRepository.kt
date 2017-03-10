package net.rocboronat.baconfreedays.repository

import java.util.*

interface BaconRepository {
    fun getLastBaconDate(): Date?
    fun updateBaconDate(now: Date)
}