import singleton441.CaseInsensitiveFileComparator
import singleton441.Payroll
import singleton441.Person
import singleton441.PersonNew
import java.io.File

fun main(args: Array<String>) {
    Payroll.allEmployees.add(Person("Nick", 5000))
    println(Payroll.calculateSalary())

    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(PersonNew("Bob"), PersonNew(("Alice")))
    println(persons.sortedWith(PersonNew.NameComparator))

}

