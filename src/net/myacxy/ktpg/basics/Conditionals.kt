package net.myacxy.ktpg.basics

import kotlin.test.assertTrue

fun main(args: Array<String>) {

    var string = "Lorem ipsum"

    // returns last value
    val ifResult = if (string.isNotEmpty()) {
        "Not empty"
    } else {
        "Empty"
    }
    println(ifResult)
    assertTrue { ifResult.contentEquals("Not empty") }

    // does not break into next case
    when (ifResult) {
        "Not empty" -> println("String is not empty")
        "Empty" -> println("String is empty")
        is String -> println("Result is a String")
    }

    // can also be used as expression
    val whenResult = when (ifResult) {
        "Not empty" -> "String is not empty"
        "Empty" -> "String is empty"
        is String -> "Result is a String"
        else -> "Result is a String"
    }
    println(whenResult)

    assertTrue { whenResult.contentEquals("String is not empty") }
}
