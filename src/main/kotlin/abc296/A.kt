package abc296

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val line = readLine()!!

    println(if (hasConsecutiveChars(N, line)) "No" else "Yes")
}

fun hasConsecutiveChars(N: Int, line: String): Boolean {
    return line.zipWithNext().any {
        (prevChar, currentChar) -> prevChar == currentChar
    }
}
