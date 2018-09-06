package arrays

fun main(array: Array<String>) {

    val myArray = arrayOf(1, 1.23, "Doug")

    println(myArray[2])
    myArray[1] = 2.14

    println("Array length : ${myArray.size}")
    println("Doug in Array : ${myArray.contains("Doug")}")

    var partArray = myArray.copyOfRange(1, 2)

    println("FirstElement : ${myArray[0]}")
    println("Doug Index : ${myArray.indexOf("Doug")} ")

    val sqArray = Array(5) { x -> x * x }
    println(sqArray[4])

    var arr2: Array<Int> = arrayOf(1, 2, 3)
}