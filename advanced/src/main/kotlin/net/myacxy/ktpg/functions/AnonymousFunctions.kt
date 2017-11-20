package net.myacxy.ktpg.functions

fun main(args: Array<String>) {

    op(3, { it * it })
    // anonymous function
    // are the same, but here we can express the return type
    op(3, fun(x): Int = x * x)

    // can have multiple return points
    op(3, fun(x): Int {
        if (x > 10) {
            return 0
        }
        return x * x
    })
}

fun op(x: Int, op: (Int) -> Int): Int = op(x)
