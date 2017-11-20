package net.myacxy.ktpg.inheritance

import kotlin.test.assertTrue

// all types are final by default
// make non-final with 'open' keyword
open class Person(var name: String = ""): Any() {
    // methods also need to be explicitly marked overridable
    open fun invalidate() {
        // does nothing
    }
}

class Customer(name: String) : Person(name) {

    constructor(name: String, makeNameUpperCase: Boolean): this(name) {
        if (makeNameUpperCase) {
            super.name = name.toUpperCase()
        }
    }

    // can make it final again with 'final' keyword
    override fun invalidate() {
        super.invalidate()
        println("invalidating")
    }
}

fun main(args: Array<String>) {
    val person = Person("Lorem Ipsum")
    person.invalidate()
    assertTrue(person.name == "Lorem Ipsum")

    val customer = Customer("Dolor Sit", true)
    customer.invalidate()
    assertTrue(customer.name == "DOLOR SIT")

    val customer2 = Customer("Dolor Sit", false)
    assertTrue(customer2.name == "Dolor Sit")
}
