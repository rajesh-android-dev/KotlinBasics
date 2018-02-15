package basics

/**
 * If logic in kotlin is similar to the one we used in java, but here we can use if condition as an expression
 * which return some value
 */
class IfExpression
{
    fun compareAge(age : Int){

        //here the if condition will assign a value to the string according to the input
        var ageLimitCrossed : String = if(age > 25) "Yes"
                                        else
                                        "No"
        println("Age limit is crossed : $ageLimitCrossed")
    }
}