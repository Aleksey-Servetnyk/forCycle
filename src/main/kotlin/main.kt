import initClasses.UserWithDefaultValue

fun main(args: Array<String>) {
    val alice = UserWithDefaultValue("Alice")
    println(alice.isSubscribed)

    val bob = UserWithDefaultValue("Bob", false)
    println(bob.isSubscribed)

    val carol = UserWithDefaultValue("Carol", isSubscribed = false)
    println(carol.isSubscribed)

}

