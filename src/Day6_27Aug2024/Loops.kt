package Day6_27Aug2024

// four loop
fun main(){

    // inclusive of both ranges
    for (i in 1..4){
        print(i)
    }
    println()

    // includes the starting and excludes the ending range
    for (i in 1 until 4) {
        print(i)
    }
    println()
    // reverse loop
    for (i in 4 downTo 1){
        print(i)
    }
    println()

    //reverse with step size

    for (i in 6 downTo 0 step 2){
        print(i)
    }
    println()

    val fruits = listOf("apple","banana","cherry")
    for (index in fruits.indices){
        print("${index} ${fruits[index]}\t")
    }
    println()

    // while loop

    var a = 5
    while (a>0){
        print(a)
        a--
    }
    println()
    //do while

    var b = 5
    do{
        print(b)
        b--
    }
    while (b>0)

    println()

    var c = 1
    do {
        print(c)
        c++
    }
    while (c<6)

    println()

}