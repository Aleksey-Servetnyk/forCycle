import flatMapFlutten524.Book
import lambdaCollections512.Person

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchet")),
        Book("Good Omens", listOf("Terry Pratchet", "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())

    val filterBooks = books.asSequence().map(Book::title).filter { it.startsWith("T") }.toList()
    println(filterBooks)
}




