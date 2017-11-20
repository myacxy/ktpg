package net.myacxy.ktpg.stdlib

fun main(args: Array<String>) {

    val elements = 1..10000000000

    // eager evaluation
    // starts printing the result all at once
//    val output = elements.filter { it < 30 }.map { Pair("Yes", it) }
//    output.forEach {
//        println(it)
//    }

    // consumes as soon as needed
//    val output2 = elements.asSequence().filter { it < 30 }.map { Pair("Yea", it) }
//    output2.forEach {
//        println(it)
//    }

    val output3 = elements.asSequence().take(30).sum()
    println(output3)

    val numbers = generateSequence(1) { x -> x + 10 }
    val output4 = numbers.take(30).sum()
    println(output4)

    val lazyInit: Int by lazy { 10 }
}
