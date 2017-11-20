package net.myacxy.ktpg.functional

import kotlin.test.assertTrue

fun main(args: Array<String>) {
    "Hello".println()

    "hello world".toTitleCase().println()
    assertTrue("hello world".toTitleCase() == "Hello World")

    val customer = Customer()
    // cannot overload base function
    customer.makePreferred()

    // extension functions are statically resolved
    val instance: BaseClass = InheritedClass()
    // infers base function
    instance.extension()

    val instance2 = InheritedClass()
    // infers inherited function
    instance2.extension()
}

fun String.println() {
    println(this)
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred() {
    println("Extended function")
}

open class BaseClass
class InheritedClass : BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}
