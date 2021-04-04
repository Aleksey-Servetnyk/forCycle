import lambdaCollections512.Person

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x +y }
    println(sum(1, 2));

    { println(42) }()
    run { println(42) }

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull { p: Person -> p.age })

    // lambda in the named argument
    val names = people.joinToString(separator = " ", transform = {p: Person -> p.name})
    println(names)

    // lambda outside brackets
    println(people.joinToString(" ") { p: Person -> p.name })

    // remove the parameter type
    println(people.joinToString(" ") { p -> p.name })

    // parameter by default
    println(people.maxByOrNull { it.age })

    // multi play lambda
    val sum1 = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum1(1, 2));


}



