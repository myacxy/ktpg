package net.myacxy.ktpg.basics

fun main(args: Array<String>) {

    var mutableInt: Int = 1
    println("mutableInt=$mutableInt")
    mutableInt += 1
    println("mutableInt=$mutableInt")

    val immutableInt: Int = 3
    println("immutableInt=$immutableInt")
    var inferedInt = 4
    println("inferedInt=$inferedInt")

    val binary = 0xb001
    println("binary=$binary")
    val hex = 0x3d3d3d
    println("hex=$hex")
    val long = 123L
    println("long=$long")

    val char:Char = 'A'
    println("char=$char")
    val inferedChar = 'B'
    println("inferedChar=$inferedChar")
    val inferedChar2 = "ABC"[2]
    println("inferedChar2=$inferedChar2")

    val multiLineString = """
        multiLineString#1
        multiLineString#2
        multiLineString#3
        """.trimIndent()
    println(multiLineString)

}
