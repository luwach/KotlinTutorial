package functions

fun main(array: Array<String>) {

    val kotlinFunctions = KotlinFunctions()

    println("5 + 4 = ${kotlinFunctions.add(5, 4)}")
    kotlinFunctions.sayHello("Paul")

    val (two, three) = kotlinFunctions.nextTwo(1)
    println("1 $two $three")

    println("Sum : ${kotlinFunctions.getSum(1, 2, 3, 4, 5)}")
    println("5 * 3 = ${kotlinFunctions.multiply(5, 3)}")

    var max = kotlinFunctions.maxOfTwo(2, 3)
    var volume = kotlinFunctions.findVolume(10, 20, 30)

    val numb = 3

    numb.isEqual(4)

    //Function that generates function
    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    val multiply2: (Int) -> Int = { num1 -> num1 * 2 }
    val numList2 = arrayOf(1, 2, 3, 4, 5)

    kotlinFunctions.mathOnList(numList2, multiply2)

    //High order functions
    fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

    val mult = makeMathFunction(3)

    println("5 * 3 = ${mult(5)}")

    //Method reference operator
    val multiplyFunc = ::multiplyValues
    var result = multiplyFunc(1, 2, 3)

    println(32.0.fahrenheit)
}

fun multiplyValues(one: Int, two: Int, three: Int) {
    println("Result is equal: ${one * two * three}")
}

fun isZeroOrOne(x: Int): Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

fun cases(obj: Any) {

}