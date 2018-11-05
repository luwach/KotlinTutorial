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

    val lol = Math.round(1.4 * 2) / 2.0
    println(lol)

    //data class
    val game = VideoGame("Gears of War", "Epic Games", 8)
    val game2 = VideoGame("Gears of War", "Epic Games", 8)

    if (game == game2) { //objects are equal because we use dataclasses, in simple classes they are not
        println("Objects are equal")
    } else {
        println("Objects are not equal")
    }

    GamesRepository.addGame(game)   //This is singleton, you only want one instance of this class

    println(game.name)
    println(game.publisher)
    println(game.reviewScore)

    game.component1()
    game.component2()
    game.component3()

    val newGame: VideoGame = game.copy(name = "Soul Reaver")
    println(newGame)
}

//in data classes we have values, not objects, stores data
data class VideoGame(val name: String, val publisher: String, var reviewScore: Int)

object GamesRepository {

    private val allGames = mutableListOf<VideoGame>()

    fun addGame(videoGame: VideoGame) {
        allGames.add(videoGame)
    }
}