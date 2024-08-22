package Day4

fun main(){
    val matrix:Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

    for (i in 0..2){
        for (j in 0..2){
            print("${matrix[i][j]}\t")
        }
        print("\n")

    }
}