package companionObjects442

class Person(val name: String) {
/*    companion object Loader {
        fun fromJSON(jsonText: String): Person = Person(jsonText)
    }*/

    companion object : JSONFactory<Person> {
        override fun fromJSON(jsonText: String): Person {
            return Person(jsonText)
        }
    }
}