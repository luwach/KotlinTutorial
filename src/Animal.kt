/**
 * Created by lukaszwachowski on 09/07/2017.
 */

//Primary constructors definition in brackets

open class Animal(color: String) {

    init {
        println("From Dog Init: $color")
    }

    open fun eat() {
        println("Animal eating")
    }
}

//jesli zamiast class uzyjemy object, to otrzymamy singleton
// i nie mozemy utworzyc instancji

class Dog(color: String, breed: String) : Animal(color) {

    init {
        println("From Dog Init: $color and $breed")
    }

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super.eat()
        println("Dog is eating")
    }
}

//Secondary constructors

open class Animal2 {

    var color: String = ""

    constructor(color: String) {
        this.color = color
    }

}

class Cat : Animal2 {

    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
    }
}