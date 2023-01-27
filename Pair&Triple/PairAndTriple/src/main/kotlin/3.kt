//Создать функцию, которая принимает в качестве параметров два положительных целых числа и возвращает
//НОК (наименьшее общее кратное) и НОД (наибольший общий делитель)

fun main() {
    var check = true
    while (check)
    {
        println("Введите целое положительное число: ")
        val value1 = readln()
        println("Введите целое положительное число: ")
        val value2 = readln()
        if (value1.toIntOrNull() != null && value1.toInt() >= 0 &&
            value2.toIntOrNull() != null && value2.toInt() >= 0)
        {
            check=false
            val func = GetMath(value1.toInt(), value2.toInt())
            println("НОК = " + func.first + "   НОД = " + func.second)
        }
        else
        {
            println("Данные введены некорректно!")
        }
    }
}
fun GetMath(num1:Int,num2: Int):Pair<Int,Int>
{
    var value1=num1
    var value2=num2
    while (value1 != value2)
    {
        if (value1 > value2)
        {
            value1 -= value2
        }
        else
        {
            value2 -= value1
        }
    }
    return  Pair(value1,num1*num2/value1)
}
