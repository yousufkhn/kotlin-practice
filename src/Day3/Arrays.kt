package Day3

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

    numbers[0] = 2
    println(numbers[0])


    for (num in numbers){
        println(num)
    }

    val matrix:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))

    println("element at [0,1] is --> ${matrix[0][1]}")

    //homework make and print a 3x3 matrix all together
}