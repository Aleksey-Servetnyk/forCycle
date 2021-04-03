package initClasses

class User(val nickname: String)

class UserFullCode constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

class UserNoInit(_nickname: String) {
    val nickname = _nickname
}

class UserWithDefaultValue(val nickname: String, val isSubscribed: Boolean = true)

open class UserSuperClass(val nickname: String) {}
class TwitterUser(nickname: String) : UserSuperClass(nickname) {}

class Secretive private constructor() {}