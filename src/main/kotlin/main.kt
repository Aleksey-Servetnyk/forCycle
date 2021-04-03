import interfaceProperties.PrivateUser
import interfaceProperties.SubscribingUser

fun main(args: Array<String>) {

    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

}

