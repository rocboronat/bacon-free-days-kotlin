package net.rocboronat.baconfreedays.repository

import android.content.SharedPreferences
import java.util.*

private const val KEY = "LastBaconDate"
private const val EMPTY = 0L

class SharedPreferencesBaconRepository(val prefs: SharedPreferences) : BaconRepository {

    override fun getLastBaconDate(): Date? {
        val storedDate = prefs.getLong(KEY, EMPTY);
        if (storedDate.equals(EMPTY)) {
            return null;
        }
        return Date(storedDate)
    }

    override fun updateBaconDate(now: Date) {
        prefs.edit().putLong(KEY, now.time).apply()
    }
}