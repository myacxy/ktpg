package net.myacxy.ktpg.tidbits

val loremIpsum = "Lorem ipsum"

// better to group constants into an object that represents the value
object Constants {
    val loremIpsum = "Lorem ipsum"
}

fun main(args: Array<String>) {

    println(Constants.loremIpsum)
    println(loremIpsum)
}
