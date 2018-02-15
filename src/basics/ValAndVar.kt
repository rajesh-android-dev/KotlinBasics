package basics

/**
 * val is used to decalare a constant, once initialized you can't change the val
 * var is used to declare a variable, you can change the variable
 */
class ValAndVar {

    fun init() {
//        val name : String = "Rajesh" // you can declare a constant like this also, anyway if you use the below type of coding, kotlin will automatically take it as the give datatype, in our case String
        val name = "Rajesh" //

//        var  myName : String = "Rajesh"
        var myName = "Rajesh"  //
        myName = "Rajesh kannan"

        println("val is ${name} and var is ${myName}") //the ${} symbols are called as string interpolation which used to declare a string inside the message string without appending
    }

}