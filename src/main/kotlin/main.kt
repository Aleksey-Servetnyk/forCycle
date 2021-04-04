import lambdaCollections512.Person

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it %2 == 0 })
    println(list.map { it * it })

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.map(Person::age))
    println(people.filter { it.age > 30 }.map(Person::name))

    println(people.filter { it.age == people.maxByOrNull(Person::age)?.age})
    val maxAge = people.maxByOrNull(Person::age)?.age
    println(people.filter { it.age == maxAge })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
    println(numbers.mapKeys { it.key })

}




