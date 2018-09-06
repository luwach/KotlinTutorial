package collections

fun main(array: Array<String>) {

    val numList2 = 1..20

    val listSum = numList2.reduce { x, y -> x + y }
    println("Reduce Sum: $listSum")

    val listSum2 = numList2.fold(5) { x, y -> x + y }
    println("Fold Sum: $listSum2")

    println("Evens : ${numList2.any { it % 2 == 0 }}")
    println("Evens : ${numList2.all { it % 2 == 0 }}")

    val big3 = numList2.filter { it > 3 }
    big3.forEach { n -> println(">3 : $n") }

    val times7 = numList2.map { it * 7 }
    times7.forEach { n -> println("times7: $n") }

    //Immutable collection - only read - listOf, mapOf, setOf
    val items = listOf("apple", "banana", "kiwi", "avocado")

    //0..items.size - it's possible

    for (index in items.indices) {
        println("items at $index is ${items[index]}")
    }

    val myNumbers = listOf(2, 3, 4, 5, 6)

    myNumbers.map { it * it }
            .forEach { println(it) }

    //another type
    for (num in myNumbers) {
        println(num)
    }

    val myMap = mapOf(4 to "Adam", 56 to "Jane", 10 to "Jake")

    for (key in myMap.keys) {
        println("item at $key is ${myMap[key]}")
    }

    items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}