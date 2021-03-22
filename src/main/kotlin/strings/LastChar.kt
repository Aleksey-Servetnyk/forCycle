package strings

fun String.lastChar(): Char = this.get(this.length - 1)
fun String.lastCharWithoutThis(): Char = get(length - 1)