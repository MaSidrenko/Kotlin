fun main() {
    val str: String? = "Hello world!"

    str?.let {
        it.printLength()
    }

    val str0: String? = null

    str0?.let {
        it.printLength()
    }

    val box = Box().apply {
        width = 10
        height = 10
    }

    box.also {
        println("Box create")

        val area = it.area()

        println("Area box: ${area}")
    }
}

fun String.printLength() {
    println("Length str: ${this.length}")
}

fun Box.area(): Int {
    return this.width * this.height
}