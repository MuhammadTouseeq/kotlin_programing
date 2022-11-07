/**
 * Counting frequencies of array elements

 */

fun main() {
    var data = listOf(10, 30, 45, 10, 65,10,23, 45, 10)
    var map = mutableMapOf<Int, Int>()
    for (num in data) {
        println(num)
        var count = 0
        data.map {
            if (it == num) {
                map.put(num, ++count)
            }
        }
    }
    map.forEach { key, value ->
        println("Element $key is $value times ")
    }
}
//Output
/*
Element 10 is 4 times
Element 30 is 1 times
Element 45 is 2 times
Element 65 is 1 times
Element 23 is 1 times
 */