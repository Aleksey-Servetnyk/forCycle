import lambdaCollections512.Person

fun main(args: Array<String>) {
    val person = Person("Bob", 39)
    val getAge = person::age
    println(getAge)

    run (::salute)

    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val predicate = p::isAdult
    println(predicate)

    val ageFun = p::age
    println(ageFun())
}

fun salute() = println("Salute!")
fun Person.isAdult() = age >= 21



