package threads

import java.lang.StringBuilder

fun main(array: Array<String>) {

//    val task = Runnable { println("Running") }
//    val thread = Thread(task)
//    thread.isDaemon = true
//    thread.start() This can be replaced with apply

    val task = Runnable { println("Running") }
    Thread(task).apply { isDaemon = true }.start()

}

//fun alphabet(): String {
//    val result = StringBuilder()
//
//    for (letter in 'A'..'Z') {
//        result.append(letter)
//    }
//
//    result.append("\nNow I know the alphabet!")
//    return result.toString()
//} can be replaced with

fun alphabet() = with(StringBuilder()) {

    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!").toString()
}