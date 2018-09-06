package classes

//Primary constructors definition in brackets

open class Animal(name: String, color: String) {

    init {
        println("From classes.Dog Init: $name and color: $color")
    }

    open fun eat() {
        println("classes.Animal eating")
    }
}

//if we use object instead of class, then we get singleton
//and we can create an instance

class Dog(name: String, color: String, breed: String) : Animal(color, name) {

    init {
        println("From classes.Dog Init: $name, $color and $breed")
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) { "Animal name can't contain number" }
    }

    fun bark() {
        println("Bark")
    }

    override fun eat() {
        super.eat()
        println("classes.Dog is eating")
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