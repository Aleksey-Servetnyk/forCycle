import lambdaCollections512.Person

fun main(args: Array<String>) {
    val canBeInClub = {p: Person -> p.age <= 27}
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub))
    println(people.any(canBeInClub))
    println(people.count(canBeInClub))
    println(people.find(canBeInClub))

    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })

}




