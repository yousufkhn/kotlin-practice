package Day7_28Aug2024

fun factorial(n:Int):Int{
    return if (n<=1) 1 else n*factorial(n-1)
}

fun main(){

    // a function that calls itself, with a base case
    print("Enter the number to get factorial : ")
    var y:Int = readln().toInt()
    println(factorial(y))

}