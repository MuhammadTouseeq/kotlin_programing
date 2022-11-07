fun main() {

    /**
     * Program for Sum of the digits of a given number
     */

    print("Enter Number: ")

    val inputNumber=readLine()!!.toInt()
    var num=inputNumber
    var sum=0

    while(num!=0)
    {
        var mode =num%10  //extra line
        sum+=num%10
        println("mode ${num}%10 ${mode} divide $num  sum=> ${sum}")
        num/=10
    }

    print("Sum of $inputNumber is $sum")

}