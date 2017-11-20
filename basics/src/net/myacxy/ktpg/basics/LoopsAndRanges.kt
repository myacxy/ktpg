package net.myacxy.ktpg.basics

import kotlin.test.assertTrue

fun main(args: Array<String>) {

    // includes 3
    for (i:Int in 1.rangeTo(3)) {
        println("loop1=$i")
    }
    for (i:Int in 1..3) {
        println("loop2=$i")
    }
    // excludes 3
    for (i:Int in 1 until 3) {
        println("loop3=$i")
    }
    assertTrue {
        val range = 1 until 3
        !range.contains(3)
    }

    val numbers = 1..100
    for (number in numbers) {
        println("loop4=$number")
    }

    // reverse
    for (i in 100 downTo 1) {
        println("reverse1=$i")
    }
    // CAUTION: empty range
    for (i in 100..1) {
        println("reverse2=$i")
    }

    for (i in 0..100 step 10) {
        println("steppedLoop=$i")
    }

    val strings = listOf("Lorem", "ipsum", "dolor", "sit", "amet")
    for (string in strings) {
        println(string)
    }

    println("while")
    var i = 0
    while (i < strings.size) {
        println(strings[i++])
    }

    println("do while")
    var j = 0
    do {
        println(strings[j++])
    } while (j < strings.size)

    // labeled break
    outer@ for (x in 1..5) {
        print("x=$x")
        for (y in 1..5) {
            val z = y % x
            if (z == 1) {
                println()
                break@outer
            }
        }
    }

    // labeled return
    (1..6).forEach outer@ { k ->
        (1..6).forEach inner@ { l ->
//            println(l % k)
            if (l % k == 5) {
                return@outer
            }
        }
    }
}
