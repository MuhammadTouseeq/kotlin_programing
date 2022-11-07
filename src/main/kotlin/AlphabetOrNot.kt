fun main() {

    var c='*'

    when(c)
    {
         in 'a'..'z'  -> println("$c is an alphabet.")
         in 'A'..'Z'  -> println("$c is an alphabet.")
        else -> println("$c is not an alphabet.")
    }

}