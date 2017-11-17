package net.myacxy.ktpg.stdlib

import java.util.*

fun main(args: Array<String>) {

    // Kotlin List interface is immutable/read-only
    // conflicts with writable java.ArrayList
    var list: List<String> = ArrayList()
    println(list.javaClass)

    // instead use
    var list2 = listOf("one", "two", "three")
    println(list2.javaClass)

    val numbers = 1..100
    println(numbers.javaClass)

    var emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val arrayList = Arrays.asList("Berlin", "Hamburg")
    println(arrayList.javaClass)


    val mutableCities = mutableListOf("Zurich")
    mutableCities.add("Munich")
    println(mutableCities.javaClass)
    val hashMap = hashMapOf("Madrid" to "Spain", "Paris" to "France")
    val booleans = booleanArrayOf(true, false, true, true)
    val characters = charArrayOf('a', 'b', 'c')
}
