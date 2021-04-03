import delegationInClasses433.CountingSet

fun main(args: Array<String>) {

    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectAdded} objects were added, ${cset.size} remain")

}

