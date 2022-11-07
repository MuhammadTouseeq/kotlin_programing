import java.util.*

fun main(args: Array<String>) {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    val evenOdd = if (num % 2 == 0) "even" else "odd"

    println("$num is $evenOdd")
}