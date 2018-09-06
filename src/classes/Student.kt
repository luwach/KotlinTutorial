package classes

class Student(name: String) {

    var id: Int = -1

    init {
        println("Students name is: $name")
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }
}

abstract class Person {

    abstract var name: String

    abstract fun eat()          // abstract properties are open by default
    open fun getHeight() {}     // An open function ready to be overridden
    fun goToSchool() {}         // A normal function: public and final by default
}

class Indian : Person() {

    override var name: String = "dummy_name"

    override fun eat() {
    }
}

interface MyInterfaceListener {

    var name: String

    fun onTouch() {
    }

    fun onClick() {
        println("OnClick interface code")
    }
}

class MyButton : MyInterfaceListener {

    override var name: String = "dummy"

    override fun onTouch() {
        println("Button was touched")
    }

    override fun onClick() {//Optional to override
        super.onClick()
    }
}

//in data classes we have values, not objects
data class VideoGame(val name: String, val publisher: String, var reviewScore: Int)