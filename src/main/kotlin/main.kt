import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    val readerExprDigit = BufferedReader(StringReader("456"))
    readNumberExpr(readerExprDigit)
    val readerExpr = BufferedReader(StringReader("Not a number"))
    readNumberExpr(readerExpr)
}

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun readNumberExpr(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        //return
        null
    }
    println(number)
}