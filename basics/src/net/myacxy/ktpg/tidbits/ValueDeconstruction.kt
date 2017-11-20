package net.myacxy.ktpg.tidbits

import net.myacxy.ktpg.classes.CustomerKotlin
import kotlin.test.assertTrue

fun main(args: Array<String>) {

    val (capital, continent, population) = countryInformation("Spain")
    println(capital)
    println(continent)
    println(population)

    val customer = CustomerKotlin(1, "Lorem Ipsum")
    val (id, name) = CustomerKotlin(1, "Lorem Ipsum")
    println(customer)
    println("id=$id, name=$name")
    assertTrue(customer.id == id)
    assertTrue(customer.name == name)


    val list = listOf(Pair("Madrid", "Spain"), "Paris" to "France")

    for ((capital, country) in list) {
        println("capital=$capital, country=$country")
    }
}
