abstract class Person {

    var age: Int = 40

    fun display(number: Int) {
        println("My snn is $number + $age")
    }

    abstract fun displayJob(eval: Int)
}

interface kotlinInterface {

//    var text: String

    fun newFunc(number: Int): String {
        return number.toString()
    }
}