package enums

fun main(array: Array<String>) {

    for (direction in Compass.values()) {
        println("Index is: ${direction.ordinal} and name is: ${direction.name}")
    }

    for (device in Devices.values()) {
        println("${device.name} - ${device.hasFrontFacingCamera}")
    }

    val compass = Compass.NORTH

    when (compass) {
        Compass.NORTH -> print("NORTH")
        Compass.WEST -> print("WEST")
        Compass.EAST -> print("EAST")
        else -> print("SOUTH")
    }

}

enum class Devices(var hasFrontFacingCamera: Boolean = true) {
    //there is no need to write in every device that this is true
    iPhoneEG(false),
    iPhone3GS(false),
    iPhone4,
    iPhone5,
    iPhone6,
    iPhone7
}

enum class Compass {
    NORTH,
    WEST,
    EAST,
    SOUTH
}