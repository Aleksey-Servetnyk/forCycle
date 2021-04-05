import creatingSequences532.isInsideHiddenDirectory
import flatMapFlutten524.Book
import lambdaCollections512.Person
import java.io.File

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchet")),
        Book("Good Omens", listOf("Terry Pratchet", "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())

    val filterBooks = books.asSequence().map(Book::title).filter { it.startsWith("T") }.toList()
    println(filterBooks)

    listOf(1, 2, 3, 4).asSequence().map { print("map($it) "); it * it }.filter { print("filter($it) "); it % 2 == 0 }.toList()

    println(listOf(1, 2, 3, 4).asSequence().map { it * it }.find { it > 3 })

    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Charles", 31), Person("Dan", 21))
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())
    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())

    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    val file = File("c:\\Users\\svtk\\.HiddenDir\\a.txt")
    println(file.isInsideHiddenDirectory())
}




