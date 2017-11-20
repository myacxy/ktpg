package net.myacxy.ktpg.functions

fun main(args: Array<String>) {

    "Hello".shouldBeEqualTo("Hello")

    val output = "Hello"
    output shouldBeEqualTo "Hello"

}

// only applicable to extension or member functions with single parameter
infix fun String.shouldBeEqualTo(value: String) = this == value
