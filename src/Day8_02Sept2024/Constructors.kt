package Day8_02Sept2024

// primary constructor is defined just after class name
// secondary constructor is an additional way to construct objects

//class Person{
//    var name:String
//    var age:Int
//
//
//    //these are secondary constructors
//    constructor(x:String,y:Int){
//        this.name = x
//        this.age = y
//    }
//
//    constructor(x:String){
//        this.name = x
//        this.age=0
//    }
//
//    constructor(){
//        this.name = "Rahul"
//        this.age = 32
//    }
//
//    fun intro(){
//        println("my name is $name and age is $age")
//    }
//}
//
//fun main(){
//    var a = Person("Riya",22)
//    a.intro()
//
//    var b = Person()
//    b.intro()
//
//    var c = Person("Heena")
//    c.intro()
//}


//now the code with primary constructors

class Person(var name:String,var age:Int){

    constructor(x:String) :this(){
        this.name = x
        this.age = 0
    }

    constructor() :this("rahul",50)

    fun intro(){
        println("my name is $name and age is $age")
    }
}

fun main(){
    var a = Person("Riya",22)
    a.intro()

    var b = Person()
    b.intro()

    var c = Person("Heena")
    c.intro()
}