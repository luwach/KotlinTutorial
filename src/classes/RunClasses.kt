package classes

fun main(array: Array<String>) {

    //Class
    val student = Student("Lukasz", 10)

    println(student.id)

    //Inheritance
    val dog = Dog("Dodge", "black", "breed")
    //dog.breed = "labra"
    //dog.color = "black"
    dog.bark()
    dog.eat()

    val lol: Double = Math.round(1.4 * 2) / 2.0
    println(lol)

    //data class
    val game = VideoGame("Gears of War", "Epic Games", 8)

    println(game.name)
    println(game.publisher)
    println(game.reviewScore)

    game.component1()
    game.component2()
    game.component3()

    val newGame: VideoGame = game.copy(name = "Soul Reaver")
    println(newGame)
}