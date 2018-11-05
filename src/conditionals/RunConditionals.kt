package conditionals

fun main(array: Array<String>) {

    val age = 8

    if (age < 5) {
        println("Go to Preschool")
    } else if (age == 5) {
        println("Go to Kinder garden")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    when (age) {

        0, 1, 2, 3, 4 -> println("Go to Preschool")

        5 -> println("Go to Kinder garden")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }

    val x = 19

    when (x) {
        in 1..10 -> println("$x is in 1 - 10 range")
        in 10..20 -> println("$x is inside this range")
        else -> println("none of the above")
    }
}