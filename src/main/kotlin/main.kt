fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
}

fun isLetter(letter: Char) = letter in 'a'..'z' || letter in 'A'..'Z'
fun isNotDigit(letter: Char) = letter !in '0'..'9'
