package basics

/**
 * When condition in kotlin is similar to the switch statement in java, but here when condition can be used as
 * an expression to return a value
 */
class WhenExpression
{
    fun calculateAndPrintBMI(weight : Int)
    {
        var bmiIndex : String = when(weight)
        {
            in 45..60 -> "Lower weight" //the expression 45..60 is called as range, which means the value is in between 45 to 60
            in 61..70 -> "Normal"
            in 71..90 -> "Over weight"
            in 90..120 -> "Obese"
            else -> "please enter a valid weight"
        }
        println("Result is : $bmiIndex")
    }
}