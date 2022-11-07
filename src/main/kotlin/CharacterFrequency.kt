/**
 * Kotlin Program to Find the Frequency of Character in a String
 */



fun main() {
    var str="This is my website"
    var ch="i"
    var frequency=0;
    str.map { if(it.toString().equals(ch)) frequency++
        print(it +" ")
    }
    println("\nFrequency of $ch = $frequency")

}