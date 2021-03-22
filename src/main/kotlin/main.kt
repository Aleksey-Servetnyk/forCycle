import strings.joinToString
import strings.joinToStringWithDefaultParameters
import strings.performOperation
import strings.reportOperationCount

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list)
    println(joinToString(list,"; ", "(", ")"))
    println(joinToString(list,separator = "; ", prefix = "(", postfix = ")"))
    println(joinToStringWithDefaultParameters(list))
    println(joinToStringWithDefaultParameters(list, "| "))
    println(joinToStringWithDefaultParameters(list, postfix = ";", prefix = "# "))

    performOperation()
    reportOperationCount()

}

