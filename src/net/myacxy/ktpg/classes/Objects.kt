package net.myacxy.ktpg.classes

// accessible from anywhere where it is imported
// not just a global object but actually rather a singleton
object Global {
    val PI: Float = 3.14f
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val PI: Float = 3.1459f
    }
    println(localObject.PI)
}
