@file:JvmName("PrefixUtil")

package net.myacxy.ktpg.interop

fun anotherPrefix(prefix: String, value: String): String {
    return "$prefix-$value"
}

val topLevelProperty = "Hello world"
const val ANOTHER_TOP_LEVEL_PROPERTY = "Hello world"
