package strings

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

    //immutable variable
    val letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")

//    Casting
    println("3.14 to Int " + (3.14.toInt()))
    println("A to Int" + ('A'.toInt()))
    println("65 to Char" + (65.toChar()))

//    Strings
    val myName = "Lukasz Wachowski"
    val longString = """This is a long String """
    val fName: String = "Doug"
    val lName: String = "Smith"

    val fullName = "$fName $lName"
    println("Name : $fullName ")

    println("1 + 2 = ${1 + 2} ")
    println("String length : ${longString.length} ")

    val str1 = "A random string"
    val str2 = "A random string"

//    true or false
    println("Strings equal : ${str1 == str2}")

//    0 or -1
    println("String equal : ${"A".compareTo("B")} ")
    println("3nd Index : ${str1[2]} ")

//    substring
    println("Index 2 - 7 :  ${str1.subSequence(2, 8)} ")
    println("Contains random ${str1.contains("random")}")
}