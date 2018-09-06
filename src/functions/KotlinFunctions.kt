package functions

class KotlinFunctions {

    fun add(num1: Int, num2: Int): Int = num1 + num2

    fun sayHello(name: String): Unit = println("Hello $name")

    fun nextTwo(num: Int): Pair<Int, Int> {
        return Pair(num + 1, num + 2)
    }

    fun getSum(vararg numbers: Int): Int {
        var sum = 0
        numbers.forEach { n -> sum += n }
        return sum
    }

    val multiply = { num1: Int, num2: Int -> num1 * num2 }

    //Function as expression
    fun maxOfTwo(a: Int, b: Int): Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }

    //Default parameters
    fun findVolume(width: Int, length: Int, height: Int = 10): Int {
        return width * length * height
    }

    //Function that generates function
    fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
//            numList.map { myFunc(it) }
//                    .forEach { println("MathOnList $it") }

        for (num in numList) {
            println("MathOnList ${myFunc(num)}")
        }
    }
}

//Extension functions
fun Int.isEqual(numb: Int) {
    if (this == numb) {
        println("Numbers are equal")
    } else {
        println("Numbers are not equal")
    }
}
