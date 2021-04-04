import lambdaAccessToVariables514.printMessagesWithPrefix
import lambdaAccessToVariables514.printProblemCounts

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error: ")

    val responses = listOf("200 Ok", "418 I`m a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}



