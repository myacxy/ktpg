package net.myacxy.ktpg.functions

import kotlin.test.assertTrue

// method implicitly returns Unit
fun printlnHello(): Unit {
    println("Hello")
}

fun throwException(): Nothing {
    throw RuntimeException()
}

// without body
fun sum(x: Int, y: Int): Int = x + y

// default parameter value
// can work with two or three parameters
// avoids method overloads
fun sum(x: Int, y: Int, z: Int = 0): Int = x + y + z

fun sum(vararg ints: Int): Int {
    var sum = 0
    for (int in ints) {
        sum += int
    }
    return sum
}

fun printSum(vararg ints: Int) {
    // star operator, spread out?
    println(sum(*ints))
}

fun main(args: Array<String>) {
    printlnHello()

    var sum = sum(10, 5)
    assertTrue { sum == 15 }
    sum = sum(10, 5, 0)
    assertTrue { sum == 15 }
    sum = sum(10, 5, 7)
    assertTrue { sum == 22 }

    // named parameters
    sum = sum(x = 10, y = 5, z = 7)
    assertTrue { sum == 22 }
    // order does not matter
    sum = sum(z = 10, y = 5, x = 7)
    assertTrue { sum == 22 }

    // varargs
    sum = sum(1, 2, 3, 4, 5, 6)
    assertTrue { sum == 21 }

    printSum(1)
    printSum(1, 2)
    printSum(1, 2, 3)
    printSum(1, 2, 3, 4)

    throwException()
}
