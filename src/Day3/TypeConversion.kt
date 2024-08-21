package Day3

fun main(){
    val x:Int = 100
    val y:Long = x.toLong()
    println(y)

    // safe cast returns null if cast is not possible -- done using 'as?'
    // unsafe cast throws a ClassCastException if cast is not possible -- done using 'as'

    val a = "hi"
    val b = a as String
    println(b)

// throws exception
//    val c = 1
//    val d = c as String
//    println(d)

    val e = 1
    val f = e as? String
    println(f)
}