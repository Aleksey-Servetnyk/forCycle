import companionObjects442.A
import companionObjects442.User
import companionObjects442.UserFab

fun main(args: Array<String>) {
    A.bar()

    val user = User("bob@csk.kr.ua")
    println(user.nickname)

    val subscribingUser = UserFab.newSubscribingUser("bob1@csk.kr")
    val facebookUser = UserFab.newFacebookUser(4)
    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}



