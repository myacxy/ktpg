package net.myacxy.ktpg.tidbits

fun capitalAndPopulation(city: String): Pair<String, Long> {
    return when(city) {
        "Madrid" -> Pair(city, 2300000)
        else -> throw NotImplementedError()
    }
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return when(country) {
        "Spain" -> Triple("Madrid", "Europe", 2300000)
        else -> throw NotImplementedError()
    }
}

fun main(args: Array<String>) {

    // Pair is just a data class
    val result: Pair<String, Long> = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)

    // Triple is also just a data class
    val result2: Triple<String, String, Long> = countryInformation("Spain")
    println(result2.first)
    println(result2.second)
    println(result2.third)
    // no more tuples than that
}
