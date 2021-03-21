import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    percentValidator(50)
    percentValidator(150)
    println(percentValidatorInExpr(50))
    println(percentValidatorInExpr(150))
}

fun percentValidator(num: Int) {
    if (num !in 0..100) throw IllegalArgumentException("A percentage value mast be between 0 and 100: $num")
}

fun percentValidatorInExpr(num: Int): Boolean {
    return if (num in 0..100) true
    else throw IllegalArgumentException("A percentage value mast be between 0 and 100: $num")
}