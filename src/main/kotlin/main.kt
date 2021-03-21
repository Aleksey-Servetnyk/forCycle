fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
    println(recognize('8'))
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

fun isLetter(letter: Char) = letter in 'a'..'z' || letter in 'A'..'Z'
fun isNotDigit(letter: Char) = letter !in '0'..'9'

fun recognize(letter: Char) =
    when (letter) {
        in '0'..'9' ->                  "It`s a digit."
        in 'a'..'z', in 'A'..'Z' ->     "It`s a letter."
        else ->                         "I don`t know..."
    }
