fun main() {
introduction("Hesed",7)
    serveDrinks(5)
    serveDrinks(9)
    serveDrinks(50)
    println(namesArray(arrayOf("Hsed","Christine","pamela","Elizabeth")))
    multiply(7,9)
    divide(9,9)
    modulus(86,9)

    var details=Human ("Hope",17,50.67.toFloat() )
    details.eat(4)
    details.speak("I love Kotlin")
    details .birthday()
}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old")
}

fun serveDrinks(age: Int){
    when(age){
        in 1..5->println("milk")
       in 7..14-> println("fanta orange")
       else->println("coca cola")


    }
}
fun namesArray(names:Array<String>):Int {
    var count = 0
    for (name in names) if (name.length > 4) {
        count++
    }

    return count
}

fun multiply(num1:Int,num2:Int){
    println(num1*num2)

}
fun divide(a:Int,b:Int){
    println(a/b)
}
fun modulus(c:Int,d:Int){
    println(c%d)
}

class Human(var name:String,var age:Int , var weight:Float){
    fun eat(foodWeight: Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
        println(weight )
    }
    fun speak(speech: String ){
        println(speech )
    }
    fun birthday(){
        println(age+1)

    }
}






