package net.myacxy.ktpg.functions

fun main(args: Array<String>) {
    // inlining works best for higher order functions
    operation { println("This is op") }
    // should only inline functions that are basically just calling the lambda being passed in

    tryingToInline { println("hello") }
}

fun anotherFunction() {
    operation { println("This is op") }
}

inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

// notice noinline keyword on parameter
inline fun anotherOperation(noinline op: () -> Unit, op2: (Int) -> Int) {
    println("Before calling op()")
    op()
    op2(1)
    println("After calling op()")
}

inline fun tryingToInline(op: () -> Unit) {
    // illegal usage of parameter op, add noinline
//    val reference = op
    println("assigned value")
    op()
}
