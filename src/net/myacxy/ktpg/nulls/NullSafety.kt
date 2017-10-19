package net.myacxy.ktpg.nulls

import java.util.*

data class Entity(var id: Int) {
    fun toJson(): String? {
        return "{ id: $id }"
    }
}

fun main(args: Array<String>) {

    val nullableString: String? = null
    val nonnullString: String = "Not null"

    println(nullableString?.length)
    // take rhs if lhs is null
    println(nullableString ?: nonnullString)
    // !! == "I know what I am doing"
    // occasionally useful with java interop
//    println(nullableString!!.length)

    // chain null checks
    println(getEntity()?.toJson()?.length)
}

private fun getEntity(): Entity? {
    return null
}
