package net.rocboronat.baconfreedays

import android.content.SharedPreferences
import java.util.*

class SharedPreferencesBaconRepository(val prefs: SharedPreferences) : BaconRepository {

    private val EMPTY = 0L

    override fun getLastBaconDate(): Date? {
        val storedDate = prefs.getLong("LastBaconDate", EMPTY);
        if (storedDate.equals(EMPTY)) {
            return null;
        }
        return Date(storedDate)
    }
}