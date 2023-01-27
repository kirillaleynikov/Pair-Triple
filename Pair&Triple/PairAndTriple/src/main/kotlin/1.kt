//Создать функцию, которая на входе принимает целое число секунд (указывается пользователем через readln())
// и возвращает три значения (часы, минуты, секунды).  В результате выполнения пользователь должен получить строку
// примерно следующего содержания ... секунд = ... часов ... минут ... секунд

fun main() {
    var check = true
    while (check) {
        println("Введите количество секунд: ")
        val second = readln()
        if (second.toIntOrNull() != null && second.toInt() >= 0)
        {
            check=false;
            val (sec,min,hour)=Time(second.toInt())
            println(second+" секунд = "+hour+" часа(-ов) "+min+" минут(-ы) "+sec+" секунд(-ы)")
        }
        else
        {
            println("Введены некорректные данные!")
        }
    }
}
fun Time(second:Int):Triple<Int,Int,Int>
{
    val hour = second/3600
    val min = (second-hour*3600)/60
    val sec = (second-hour*3600)-(min*60)
    return Triple (sec,min,hour)
}
