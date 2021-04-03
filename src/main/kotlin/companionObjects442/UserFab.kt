package companionObjects442

class UserFab private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = UserFab(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = UserFab(getFacebookName1(4))
        private fun getFacebookName1(accountId: Int) = "UserFabNickname"
    }
}