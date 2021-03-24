import localFunctions.User

fun main(args: Array<String>) {

    val user = User(1, "Bob", "")
    user.saveUser3(user)
    user.saveUser2(user)
    user.saveUser1(user)
    user.saveUser(user)

}

