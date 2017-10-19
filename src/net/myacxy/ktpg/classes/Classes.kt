package net.myacxy.ktpg.classes

import kotlin.test.assertTrue

class Customer {
    // no concept of fields, only properties
    var id = 0
    var name: String = ""
}

class ConstructedCustomer(newId: Int, newName: String) {
    val id = newId
    val name: String = newName
}

// add var or val to make it a property
// can have default values
class ConstructedCustomer2(id: Int, var name: String = "") {
    init {
        name = name.toUpperCase()
    }
}

class ConstructedCustomer3(id: Int, var name: String = "") {
    // secondary constructor needs to call base construtor
    // var/val not allowed
    constructor(email: String = ""): this(0, "")

    // read-only property
    val hasName: Boolean
        get() = name.isNotEmpty()
}

class ConstructedCustomer4(id: Int, var name: String = "") {

    // custom setter
    var address: String = ""
        // value can be named anything
        set(value) {
            // validation, manipulation...
            // field is special property that refers to backing field
            field = value.trim()
        }

    fun asString(): String {
        return "id=?, name=$name, address=$address"
    }
}

// notice data keyword
// parameters need to have var/val
data class DataCustomer(var id: Int, var name: String = "") {
    // automatic toString, hashCode, equals, copy, can be overridden
}

fun main(args: Array<String>) {

    // no new keyword needed
    val customer = Customer()
    customer.id = 1
    customer.name = "Lorem Ipsum"

    val constructedCustomer = ConstructedCustomer(2, "Lorem Ipsum")
//    constructedCustomer.id = 1
    val constructedCustomer2 = ConstructedCustomer2(3, "Lorem Ipsum")
    // id not accessible since var/val is missing
//    constructedCustomer2.id
    println(constructedCustomer2.name)

    val constructedCustomer3 = ConstructedCustomer3("lorem@ipsum.dolor")
    assertTrue { !constructedCustomer3.hasName }
    val constructedCustomer4 = ConstructedCustomer4(4, "Lorem Ipsum")
    constructedCustomer4.address = "   address   "
    assertTrue { constructedCustomer4.address.contentEquals("address") }

    println(constructedCustomer4.asString())

    val dc1 = DataCustomer(id = 0, name = "Lorem Ipsum")
    val dc2 = DataCustomer(id = 0, name = "Lorem Ipsum")
    println(dc1)
    println(dc2)
    assertTrue { dc1 == dc2 }
    val dc3 = dc1.copy(id = 3)
    println(dc3)
    assertTrue { dc1 != dc3 }
}
