package interfaceProperties

interface UserWithProperty {
    val email: String
    val nickname: String
    get() = email.substringBefore('@')
}