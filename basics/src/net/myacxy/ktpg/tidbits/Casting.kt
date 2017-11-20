package net.myacxy.ktpg.tidbits

fun main(args: Array<String>) {

    var input: Any = 10

    // -> ClassCastException
    // no implicit conversions in Kotlin
    try {
        val str = input as String
        println("str=${str.length}")
    } catch (e: Exception) {
        e.printStackTrace()
    }


    val str2 = input as? String
    println("str2=${str2?.length}")
}

open class Person {

}

class Employee: Person() {

    fun vacationDays(days: Int) {

    }
}

class Contractor: Person() {

}

fun hasVacation(obj: Person) {
    if (obj is Employee) {
        // smart casting
        obj.vacationDays(20)
    }
}
