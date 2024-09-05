package Day10_05Sept2024

fun main(){
    println("Enter the purchase amount: ")
    var amount = readln().toInt()

    println("Do the customer have a membership? ('true' or 'false') ")
    var isMembership = readln().toBoolean()

    if(isMembership){
        if(amount>=1000){
            println("Discounted price : ${(amount*80)/100}")
        }
        else{
            println("Discounted price : ${(amount*90)/100}")
        }
    }
    else{
        println("You are not eligible for discount...")
    }
}