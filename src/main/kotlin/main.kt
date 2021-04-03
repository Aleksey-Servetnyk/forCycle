import accessorMethods424.logMessage
import changingTheVisibilityOfAccessors.LengthCounter

fun main(args: Array<String>) {
   val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}

