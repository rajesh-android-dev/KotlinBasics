package basics

class ValAndVar {

    fun init() {
//        val name : String = "Rajesh" // you can declare a constant like this also, anyway if you use the below type of coding, kotlin will automatically take it as the give datatype, in our case String
        val name = "Rajesh" // val is used to decalare a constant, once initialized you can't change the val

//        var  myName : String = "Rajesh"
        var myName = "Rajesh"  //var is used to declare a variable, you can change the variable
        myName = "Rajesh kannan"

        println("val is ${name} and var is ${myName}")
    }

}