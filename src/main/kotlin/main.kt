import lambdaCollections512.Person
import lambdaCollections512.findTheOldest

fun main(args: Array<String>) {

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    findTheOldest(people)

    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))
}



