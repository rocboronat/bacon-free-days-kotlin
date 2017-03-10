package net.rocboronat.baconfreedays

import java.util.*

open class Clock {
    open fun now(): Date {
        return Date()
    }
}
