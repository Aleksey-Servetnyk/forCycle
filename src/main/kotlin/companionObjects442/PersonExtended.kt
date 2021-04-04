package companionObjects442

class PersonExtended(val firstName: String, val lastName: String) {
    companion object{}
}

fun PersonExtended.Companion.fromJSON(json: String): PersonExtended {
    val firstName: String = json.substringBefore('@')
    val lastName: String = json.substringAfterLast('@')
    return PersonExtended(firstName, lastName)
}

val p = PersonExtended.fromJSON("test@json")