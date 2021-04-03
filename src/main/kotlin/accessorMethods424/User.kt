package accessorMethods424

class User(private val name: String) {
    var address: String = "unspecified"
    set(value: String) {
        println("""Address was changed for $name: "$field" -> "$value".""".trimIndent())
        field = value
    }
}

fun logMessage() {
    val user = User("Alice")
    user.address = "Elsheqhamestrasse 47, 80687 Muenchen"
}