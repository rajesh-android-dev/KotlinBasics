package basics

class RangeExpression
{
    fun assignRanges()
    {
        //range1 contains value from 1 to 10
        val range1 = 1..10

        //range2 contains value from 10 to 1
        val range2 = 10 downTo 1

        //range3 contains value from 10,8,6,4,2
        val range3 = 10 downTo 1 step 2

        //range4 contains char value from a,b,c to z
        val range4 = 'a'..'z'

        //range5 contains value from 1 to 10; same as the first expression
        val range5 = 1.rangeTo(10)

        //range6 contains value from 10 to 1; same as the second expression
        val range6 = 10.downTo(1)
    }
}