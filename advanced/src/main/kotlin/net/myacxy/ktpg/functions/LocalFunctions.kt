package net.myacxy.ktpg.functions

fun main(args: Array<String>) {

    // cannot access bar()
    foo("foo")
}

fun foo(foo: String) {

    val value = "value"

    fun bar(bar: String) {
        println("foo=$foo, bar=$bar, value=$value")
    }

    bar("bar")
}
