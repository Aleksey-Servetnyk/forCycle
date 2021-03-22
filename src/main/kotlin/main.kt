import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

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

}

@JvmOverloads
fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> joinToStringWithDefaultParameters(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}