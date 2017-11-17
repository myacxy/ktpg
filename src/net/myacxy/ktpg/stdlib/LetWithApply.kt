package net.myacxy.ktpg.stdlib

import java.io.File

fun main(args: Array<String>) {
    val file = File("input.txt")

    if (file.isAbsolute) {
        // ...
        val name = file.name
        val parent = file.parent
    }

    // @see with, apply, let
    with(file) {
        val absolute = isAbsolute
        val name = name
        val parent = parent
    }

    val person = Person("", 0)
    person.apply {
        name = "Lorem Ipsum"
        age = 99
    }
    val (name, age) = person.let {
        Pair(it.name, it.age)
    }
    println("name=$name, age=$age")

    val (name2, age2) = with(person) {
        Pair(name, age)
    }
    println("name2=$name2, age2=$age2")
}

class Person(var name: String, var age: Int) {

}
