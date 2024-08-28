package Day7_28Aug2024

import java.util.*

fun celToFah(cel:Double):Double{
    var far:Double = (1.8*cel)+32
    return far
}

fun fahToCel(fah:Double):Double{
    var cel:Double = 0.55*(fah-32)
    return cel
}


fun main(){
    val reader = Scanner(System.`in`)

    println("What do u wanna convert\n (1)-> celsius to farhenite \n (2) farhenite to celsius")
    val choice:Int = reader.nextInt()
    if(choice==1){
        println("Enter the temp in celsius: ")
        val cel:Double = reader.nextDouble()
        println(celToFah(cel))
    }
    else{
        println("Enter the temp in farhenite: ")
        val fah:Double = reader.nextDouble()
        println(fahToCel(fah))
    }
}