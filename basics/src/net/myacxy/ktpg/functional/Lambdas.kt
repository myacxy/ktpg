package net.myacxy.ktpg.functional

import kotlin.test.assertTrue

fun main(args: Array<String>) {

    // types can be inferred
    val result2 = operation(1, 2, { x, y -> x + y })
    assertTrue(result2 == 3)

    // variable assignments need explicit types
    val op: (Int, Int) -> Int = { x, y -> x + y }
    val result3 = operation(1, 2, op)


    unaryOperation(2, { x -> x * x })
    // named parameter can be referred to as it
    unaryOperation(2, { it * it })
    // if higher order function has a higher order function as last parameter
    // handy for domain-specific languages
    unaryOperation(2) { it * it }

    // no brackets needed if only parameter is higher order function
    unaryOp { it * it }
    // can be in multiple lines, making it look it a language keyword
    unaryOp {
        it * it
    }


    val db = Database()
    transaction(db) {
        // interact with database
        // db.commit() is automatically executed at the end
    }

    // anonymous function, has no name
    // can have multiple return points
    unaryOperation(2, fun(x: Int): Int { return x + x })
}

fun unaryOperation(x: Int, op: (Int) -> Int) {
    op(x)
}

fun unaryOp(op: (Int) -> Int) {}

class Database {
    fun commit() {}
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}
