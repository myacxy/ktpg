package net.myacxy.ktpg.functional

import kotlin.test.assertTrue

// higher order function taking two ints and a function that takes two ints
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(x: Int, op: (Int) -> Unit) {
    op(x)
}

fun route(path: String, vararg actions: (String, String) -> String) {
    // ...
}

fun main(args: Array<String>) {
    val result = operation(1, 2, ::sum)
    assertTrue(result == 3)
}
