/**
 * Created by lukaszwachowski on 05/07/2017.
 */

fun main(array: Array<String>) {

//    var bigInt: Int = Int.MAX_VALUE
//    var smallInt: Int = Int.MIN_VALUE
//
//    println("BiggestInt : " + bigInt)
//    println("SmallestInt : $smallInt")
//
//    var bigLong: Long = Long.MAX_VALUE
//    var smallLong: Long = Long.MIN_VALUE
//
//    println("BigestLong : $bigLong")
//    println("SmallestLong : $smallLong")

//    if (true is Boolean) {
//        print("True is boolean\n")
//    }
//
//    var letterGrade: Char = 'A'
//    println("A is a Char: ${letterGrade is Char}")
//
//    Casting
//
//    println("3.14 to Int " + (3.14.toInt()))
//    println("A to Int" + ('A'.toInt()))
//    println("65 to Char" + (65.toChar()))
//
//    Strings

//    val myName = "Lukasz Wachowski"
//    val longString = """This is a long String """
//    var fName: String = "Doug"
//    var lName: String = "Smith"
//
//    var fullName = fName + " " + lName
//    println("Name : $fullName ")
//
//    println("1 + 2 = ${1 + 2} ")
//    println("String length : ${longString.length} ")
//
//    var str1 = "A random string"
//    var str2 = "a random string"
//
//  true or false
//    println("Strings equal : ${str1.equals(str2)}")
//
//    0 or -1
//    println("String equal : ${"A".compareTo("B")} ")
//    println("3nd Index : ${str1.get(2)} ")
//
//    substring
//
//    println("Index 2 - 7 :  ${str1.subSequence(2,8)} ")
//
//    println("Contains random ${str1.contains("random")}")

//    Arrays

//    var myArray = arrayOf(1, 1.23, "Doug")
//
//    println(myArray[2])
//    myArray[1] = 2.14
//
//    println("Array length : ${myArray.size}")
//    println("Doug in Array : ${myArray.contains("Doug")}")
//
//    var partArray = myArray.copyOfRange(1, 2)
//
//    println("FirstElement : ${myArray.get(0)}")
//    println("Doug Index : ${myArray.indexOf("Doug")} ")
//
//    var sqArray = Array(5, { x -> x * x })
//    println(sqArray[4])
//
//    var arr2: Array<Int> = arrayOf(1, 2, 3)

//    Ranges

//    val oneTo10 = 1..10
//    val alpha = "A".."Z"
//
//    println("R in Alpha : ${"R" in alpha}")
//
//    val tenToOne = 10.downTo(1)
//    val twoTo20 = 2.rangeTo(20)
//    val rng3 = oneTo10.step(3)
//
//    for (x in rng3) {
//        println("rng3 : $x")
//    }
//
//    for(x in tenToOne.reversed()){
//        println("Reversed : $x")
//    }

//    Conditionals

    val age = 8
//
//    if (age < 5) {
//        println("Go to Preschool")
//    } else if (age == 5) {
//        println("Go to Kindergarden")
//    } else if ((age > 5) && (age <= 17)) {
//        val grade = age - 5
//        println("Go to Grade $grade")
//    } else {
//        println("Go to College")
//    }
//
    when (age) {

        0, 1, 2, 3, 4, 5 -> println("Go to Preschool")

        5 -> println("Go to Kindergarden")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }
//
//    val x: Int = 19
//
//    when (x) {
//
//        in 1..10 -> println("x is in 1 - 10 range")
//        in 10..20 -> println("$x is inside this range")
//        else -> println("none of the above")
//
//    }

//    Looping

//    for (x in 1..10) {
//        println("Loop: $x")
//    }
//
//    val rand = Random()
//    val magicNum = rand.nextInt(50) + 1
//
//    var guess = 0
//
//    while (magicNum != guess) {
//        guess += 1
//    }
//
//    println("Magic number was: $guess")
//
//    for (x in 1..20) {
//        if (x % 2 == 0) {
//            continue
//        }
//
//        println("Odd: $x")
//
//        if (x == 15) {
//            break
//        }
//    }
//
//    var arr3: Array<Int> = arrayOf(3, 6, 9)
//
//    for (i in arr3.indices) {
//        println("Mult 3: ${arr3[i]}")
//    }
//
//    for((index, value) in arr3.withIndex()){
//        println("Index : $index Value: $value")
//    }

//    Functions

//    fun add(num1: Int, num2: Int): Int = num1 + num2
//    println("5 + 4 = ${add(5, 4)}")
//
//    fun substract(num1: Int, num2: Int): Int = num1 - num2
//    println("5 - 4 = ${substract(5, 4)}")
//
//    fun sayHello(name: String): Unit = println("Hello $name")
//    sayHello("Paul")
//
//    fun nextTwo(num: Int): Pair<Int, Int> {
//        return Pair(num + 1, num + 2)
//    }
//
//    val (two, three) = nextTwo(1)
//    println("1 $two $three")
//
//    fun getSum(vararg nums: Int): Int {
//        var sum = 0
//        nums.forEach { n -> sum += n }
//
//        return sum
//    }

//    println("Sum : ${getSum(1,2,3,4,5)}")
//
//    val multiply = { num1: Int, num2: Int -> num1 * num2 }
//
//    println("5 * 3 = ${multiply(5, 3)}")

//    High order functions

//    val numList = 1..20
//
//    val evenList = numList.filter { it % 2 == 0 }
//    evenList.forEach { n -> println(n) }
//
////    function that generates functions
//
//    fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
//    val mult3 = makeMathFunction(3)
//    println("5 * 3 = ${mult3(5)}")
//
//    fun mathonList (numList: Array<Int>, myFunc: (num: Int) -> Int){
//        for(num in numList){
//            println("MathonList ${myFunc(num)}")
//        }
//    }
//
//    val multiply2 = {num1: Int -> num1 * 2}
//
//    val numList3 = arrayOf(1,2,3,4,5)
//
//    mathonList(numList3, multiply2)

//    Collection operators

//    val numList2 = 1..20
//
//    val listSum = numList2.reduce { x, y -> x + y }
//    println("Reduce Sum: $listSum")
//
//    val listSum2 = numList2.fold(5) { x, y -> x + y }
//    println("Fold Sum: $listSum2")
//
//    println("Evens : ${numList2.any {it % 2 == 0}}")
//    println("Evens : ${numList2.all {it % 2 == 0}}")
//
//    val big3 = numList2.filter { it > 3 }
//    big3.forEach { n -> println(">3 : $n") }
//
//    val times7 = numList2.map { it * 7 }
//    times7.forEach { n -> println("times7: $n") }
//
//
//    val items = listOf("apple", "bannana", "kiwi", "avocado")
//
//    for (index in items.indices) {
//        println("items at $index is ${items[index]}")
//    }
//
//    items.filter { it.startsWith("a") }
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }

//    data class

    val game: VideoGame = VideoGame("Gears of War", "Epic Games", 8)

    println(game.name)
    println(game.publisher)
    println(game.reviewScore)

    game.component1()
    game.component2()
    game.component3()

}

data class VideoGame(val name: String, val publisher: String, var reviewScore: Int)