package Day4

fun main(){

    //arithemetic operators
    var a = 10
    var b = 5
    var sum = a+b
    println("The sum of $a + $b = $sum")
    println("The sum of $a + $b = ${a+b}")

    var c = 15
    var d = 20
    println("The product of $c and $d = ${c*d}")

    println("The difference of $c and $d = ${c-d}")

    println("The result of $a / $b = ${a/b}")

    println("The modulus of $a and $b = ${a%b}")

    // relational operators

    println("$a > $b = ${a>b}")
    println("$a < $b = ${a<b}")
    println("$a >= $b = ${a>=b}")
    println("$a <= $b = ${a<=b}")
    println("$a == $b = ${a==b}")
    println("$a != $b = ${a!=b}")

    // assignment operators

    a+=b
    println("$a")

    a-=b
    println("$a")

    a*=b
    println("$a")

    a/=b
    println("$a")

    a%=b
    println("$a")

    // unary operators

    a = 10
    println("${+a}")

    println("${-a}")

    println("${++a}")

    println("${--a}")

    println("${!true}")


    // logical operators




}