package interfaceProperties

class FacebookUser(private val accountId: Int) : User {
    override val nickname = getFacebookName(accountId)

    private fun getFacebookName(accountId: Int) : String = "TEST"
}