package net.myacxy.ktpg.tidbits

import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {
    try {
        checkIfNumber("A")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }

    var buffer = BufferedReader(FileReader("input.txt"))
    try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    } finally {
        buffer.close()
    }

    buffer = BufferedReader(FileReader("input.txt"))
    // can also be used as an expression
    // remember: last line is the return value
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    } finally {
        buffer.close()
    }
    println(result)

    buffer = BufferedReader(FileReader("input.txt"))
    buffer.use {
        val chars = CharArray(30)
        try {
            it.read(chars, 0, 40)
        } catch (e: IndexOutOfBoundsException) {
            println(e.message)
        }
    }
}

fun checkIfNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("Not a number.")
    }
}

class NotANumberException(msg: String) : Throwable(msg)
