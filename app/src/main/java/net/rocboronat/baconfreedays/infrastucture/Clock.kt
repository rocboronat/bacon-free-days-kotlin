package net.rocboronat.baconfreedays.infrastucture

import java.util.*

open class Clock {
    open fun now(): Date {
        return Date()
    }
}
