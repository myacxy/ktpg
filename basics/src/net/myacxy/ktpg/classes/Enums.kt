package net.myacxy.ktpg.classes

import kotlin.test.assertTrue

enum internal class WeekDay(val value: Int) {
    MONDAY(1) {
        override fun abstractFun(): String {
            return "1=Monday"
        }

        override fun toString(): String {
            return asString()
        }
    },
    TUESDAY(2) {
        override fun abstractFun(): String {
            return "2=Tuesday"
        }
    },
    WEDNESDAY(3) {
        override fun abstractFun(): String {
            return "3=Wednesday"
        }
    };

    fun asString(): String {
        return "{ name: \"$name\", value: $value }"
    }

    abstract fun abstractFun(): String
}

fun main(args: Array<String>) {
    println(WeekDay.TUESDAY.asString())
    assertTrue { WeekDay.WEDNESDAY.value == 3 }
    assertTrue { WeekDay.MONDAY.abstractFun() == "1=Monday" }
    assertTrue { WeekDay.MONDAY.asString() == WeekDay.MONDAY.toString() }
}
