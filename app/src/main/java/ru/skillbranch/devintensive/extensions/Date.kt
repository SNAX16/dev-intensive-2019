package com.example.dev_intensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun Date.datFormat(pattern: String = "HH:mm:ss dd:MM:yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, utils: TimeUnite = TimeUnite.SECOND): Date {
    var time = this.time

    time += when (utils) {
        TimeUnite.SECOND -> value * SECOND
        TimeUnite.MINUTE -> value * MINUTE
        TimeUnite.HOUR -> value * HOUR
        TimeUnite.DAY -> value * DAY
    }
    this.time = time
    return this
}

fun Date.humanizeDiff(data:Date = Date()): String {
TODO("Забахать функцию для нормального времени")
}
enum class TimeUnite {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}