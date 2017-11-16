package net.myacxy.ktpg.functional

fun main(args: Array<String>) {
    outsideFunction()
}

fun outsideFunction() {
    for (number in 1..10) {
        // lambda has access to the variable in the function
        // "it is closing in on the variable"
        // "value captured in a closure"
        unaryOperation(20, {
            // number varies / updates all the time
            // in some languages the value is constant to what is captured the first time
            println(number)
            it * number
        })
    }
}
