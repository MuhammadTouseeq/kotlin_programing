fun main() {
    print("Enter number ")
    var num= readLine()!!.toInt()
    var factorial=1;
    for (i in 1..num)
    {
        factorial=factorial*i

    }
    print(factorial)

}