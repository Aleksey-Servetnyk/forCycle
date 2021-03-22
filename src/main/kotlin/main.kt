import extensionFunction.Button
import extensionFunction.View
import extensionFunction.showOff
import extensionProperty.lastChar
import strings.join
import strings.lastChar
import java.lang.StringBuilder
import strings.lastCharWithoutThis as last

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".last())

    val list = listOf(1, 2 ,3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))

    val list1 = arrayListOf(1, 2, 3)
    println(list1.joinToString(" "))

    println(listOf("one", "two", "eight").join(" "))

    val view: View = Button()
    view.click()
    view.showOff()

    println("Kotlin".lastChar())

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

