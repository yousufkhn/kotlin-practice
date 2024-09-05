package Day10_05Sept2024

fun main(){
    var balance:Int = 1000;

    println("Welcome to our bank!")

    while(true){
        println("Your current bank balance is ${balance}")
        println("Enter the amount you want to widthdraw : ")
        val amount = readln().toInt()?:0

        if(amount<=balance){
            println("${amount} widthdrawed!!")
            balance=balance-amount
        }
        else{
            println("Insufficient balance!!")
        }

        println("Do u want to continue using our bank? (1 for yes, 2 for no) ")
        val check = readln().toInt()

        if(check==1){
            continue
        }
        else {
            println("Thank u for using our bank!")
            break
        }
    }
}