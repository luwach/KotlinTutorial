package lambdas

fun main(array: Array<String>) {

    val people = listOf(Person("John", 24), Person("Sam", 30), Person("Garry", 35))
    println(people.maxBy({ p: Person -> p.age }))
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p -> p.age })
    println(people.maxBy { it.age })


    foo("hello", { message: String -> message.reversed() })
    foo("hello") { message -> message.reversed() }
    foo("hello") { it.reversed() }
}

data class Person(val name: String, val age: Int)

fun foo(str: String, fn: (String) -> String) {

    val applied = fn(str)
    println(applied)
}