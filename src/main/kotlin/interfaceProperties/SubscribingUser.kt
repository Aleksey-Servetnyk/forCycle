package interfaceProperties

class SubscribingUser(private val email: String) : User {
    override val nickname: String
    get() = email.substringBefore('@')
}