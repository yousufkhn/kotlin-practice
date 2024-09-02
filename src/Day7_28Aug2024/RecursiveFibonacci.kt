package Day7_28Aug2024

fun printFibonacciSeries(n:Int){
    if(n==0){
        println("Fibonacci series: []")
    }
    val series = mutableListOf(0,1)

    for (i in 2 until n){
        series.add(series[i-1] + series[i-2])
    }
    println("Fibonacci series : ${series.take(n)}")
}

fun main(){
    println("Enter a number to generate fibonacci series: ")
    val input = readlnOrNull()
    val n = input?.toIntOrNull()

    if(n==null || n<0){
        println("Invalid input. Please provide a valid non-negative integer.")
    }
    else{
        printFibonacciSeries(n)
    }
}