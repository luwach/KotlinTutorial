package nullability

fun main(array: Array<String>) {

    //Safe calls
    val middleName: String? = "John"

    var age: Int? = 32

//    age += 1      //Nullability closes age value in the box
    age = age!! + 1   //!! puts value out of the box, so it can be changed, 100% not null

    print(age)

//    if (middleName != null) {
//        print(middleName.length)
//    } we can replace this by safe calls

    middleName?.length //middleName is not null

    middleName?.let {
        var len = it.length //let allows to access unwrapped value
    }

    //Elvis operator
    val number: Int? = 10
    val result = number ?: 0 //When value isn't null give me age or give me 0
}