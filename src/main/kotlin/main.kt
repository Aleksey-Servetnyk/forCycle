import companionObjects442.Person
import companionObjects442.PersonExtended
import companionObjects442.fromJSON

fun main(args: Array<String>) {
    val person = Person.Companion.fromJSON("{name: 'Dmitriy'}")
    println(person.name)

    val p = PersonExtended.fromJSON("Alexey@Servetnyk")
    println("${p.firstName} ${p.lastName}")
}



