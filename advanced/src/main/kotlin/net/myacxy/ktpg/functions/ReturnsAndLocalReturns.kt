package net.myacxy.ktpg.functions

fun main(args: Array<String>) {
    containingFunction()
    containingFunction2()
    containingFunction3()
    containingFunction4()
}

fun containingFunction() {
    val numbers = 1..100

    numbers.forEach {
        if (it % 5 == 0) {
            // will return from the containing function because forEach is inlined
            // non-local returns are only allowed from inline functions
            return
        }
    }
    // unreachable
    println("Hello containingFunction!")
}

fun containingFunction2() {
    val numbers = 1..100

    numbers.forEach {
        if (it % 5 == 0) {
            // local return / labeled return
            return@forEach
        }
    }
    println("Hello containingFunction2!")
}

fun containingFunction3() {
    val numbers = 1..100

    numbers.forEach customLabel@ {
        if (it % 5 == 0) {
            return@customLabel
        }
    }
    println("Hello containingFunction3!")
}

fun containingFunction4() {
    val numbers = 1..100

    // anonymous function allows local return without label
    // "returns to the closest fun"
    numbers.forEach(fun(element) {
        if (element % 5 == 0) {
            return
        }
    })
    println("Hello containingFunction4!")
}
