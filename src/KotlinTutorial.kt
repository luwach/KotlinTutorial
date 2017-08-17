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
//    println("BiggestLong : $bigLong")
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
    //Immutable collection - można tylko odczytywać - listOf, mapOf, setOf
    val items = listOf("apple", "banana", "kiwi", "avocado")

    //0..items.size - taki zapis też jest możliwy

    for (index in items.indices) {
        println("items at $index is ${items[index]}")
    }

    val myNumbers = listOf(2, 3, 4, 5, 6)

    myNumbers.map { it * it }
            .forEach { println(it) }

//    inny zapis
//    for (num in myNumbers) {
//        println(num)
//    }

//    val myMap = mapOf(4 to "Adam", 56 to "Jane", 10 to "Jake")
//
//    for (key in myMap.keys) {
//        println("item at $key is ${myMap[key]}")
//    }
//
//    items.filter { it.startsWith("a") }
//            .sortedBy { it }
//            .map { it.toUpperCase() }
//            .forEach { println(it) }

//    Kotlin functions

    val kotlinFunctions: KotlinFunctions = KotlinFunctions()
//
//    println("5 + 4 = ${kotlinFunctions.add(5, 4)}")
//
//    println("5 - 4 = ${kotlinFunctions.substract(5, 4)}")
//
//    kotlinFunctions.sayHello("Paul")
//
//    val (two, three) = kotlinFunctions.nextTwo(1)
//    println("1 $two $three")
//
//    println("Sum : ${kotlinFunctions.getSum(1,2,3,4,5)}")
//
//    println("5 * 3 = ${kotlinFunctions.multiply(5, 3)}")
//
//    var max = kotlinFunctions.maxOfTwo(2,3)
//
//    var volume = kotlinFunctions.findVolume(10, 20, 30)
//
//    val numb: Int = 3
//
//    numb.isEqual(4)

//    Function that generates function

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }

    evenList.forEach { n -> println(n) }

    val multiply2 = { num1: Int -> num1 * 2 }

    val numList2 = arrayOf(1, 2, 3, 4, 5)

    kotlinFunctions.mathOnList(numList2, multiply2)

//    High order functions

    fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

    val mult = makeMathFunction(3)

    println("5 * 3 = ${mult(5)}")

//    Class

    val student = Student("Lukasz", 10)

    println(student.id)

//    Inheritance

    val dog = Dog("labra", "black")
//    dog.breed = "labra"
//    dog.color = "black"
    dog.bark()
    dog.eat()

    val lol: Double = Math.round(1.4 * 2) / 2.0
    println(lol)

//    data class

    val game: VideoGame = VideoGame("Gears of War", "Epic Games", 8)

    println(game.name)
    println(game.publisher)
    println(game.reviewScore)

    game.component1()
    game.component2()
    game.component3()

    val newGame: VideoGame = game.copy(name = "Soul Reaver")
    println(newGame)

}

// w data class mamy doczynienia z wartościami a nie obiektami
data class VideoGame(val name: String, val publisher: String, var reviewScore: Int)