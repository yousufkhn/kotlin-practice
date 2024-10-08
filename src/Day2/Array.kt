package `Day 2`

fun main() {
    val numbers = arrayOf(1,2,3,4,5)

    val words : Array<String> = arrayOf("Kotlin", "Java", "InteliJ")

    val squares = Array(5) {i -> i*i}

    for (i in 0..4){
        println(squares[i])
    }

    val firstNumber = numbers[0]
    val firstWord = words[0]

    println("The first number is $firstNumber")
    println("The first word is $firstWord")
}