package singleton441

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary(): Int {
        allEmployees.add(Person("Bob"))
        allEmployees.add(Person("Alice"))
        var salary: Int = 0
        for (person in allEmployees) {
            salary += person.salary
        }
        return salary
    }
}

class Person(val name:String, val salary: Int = 2000)