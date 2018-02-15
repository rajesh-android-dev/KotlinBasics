import basics.IfExpression
import basics.RangeExpression
import basics.ValAndVar
import basics.WhenExpression

fun main (args : Array<String>){

    println("Hello world")

    //this is the class initialization in kotlin, there is no need for new keyword
    val valVar = ValAndVar()
    valVar.init()

    //If as an expression
    val ifExp = IfExpression()
    ifExp.compareAge(30)

    //When as an expression
    val whenExp = WhenExpression()
    whenExp.calculateAndPrintBMI(80)

    //range
    val rangeExp = RangeExpression()
    rangeExp.assignRanges()
}