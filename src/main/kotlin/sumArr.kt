fun main() {

    var data= listOf(8,5,6,-1,2,3)
    var sum=0
    data.map { data->
        sum+=data
    }
    println("Max "+data.maxOrNull())
    println("Min "+data.minOrNull())


    /**
     * Second approach
     */

    var max=data.firstOrNull()
    var min=data.firstOrNull()

    data.map { if(it>max!!) max=it  }
    println("Max num = $max")
    data.map { if(it<min!!) min=it  }
    println("Min num = $min")
}