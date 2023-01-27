//Создать функцию, которая принимает в качестве параметров координаты двух точек на плоскости и вычисляет
// расстояние между этими точками. Функция имеет всего два параметра.

import java.text.DecimalFormat
import kotlin.math.roundToInt

fun main() {
    var check = true
    while (check) {
        println("Введите координаты первой точки ")
        print("X: ")
        val x1 = readln()
        print("Y: ")
        val y1 = readln()
        println("Введите координаты второй точки ")
        print("X: ")
        val x2 = readln()
        print("Y: ")
        val y2 = readln()

        if (x1.toDoubleOrNull()!=null && x2.toDoubleOrNull()!=null &&
            y1.toDoubleOrNull()!=null && y2.toDoubleOrNull()!=null )
        {
            check = false
            val MasPoint1:Array<Double> = arrayOf(x1.toDouble(),y1.toDouble())
            val MasPoint2:Array<Double> = arrayOf(x2.toDouble(),y2.toDouble())
            println("Растояние между двумя точками : " + Distance(MasPoint1,MasPoint2))
        }
        else
        {
            println("Данные введены некоректно!")
        }
    }
}
fun Distance (Point1: Array<Double>, Point2: Array<Double>):String
{
    val df = DecimalFormat("#.##")
    if(Point1[0]!=Point2[0] && Point1[1]!=Point2[1])
    {
        return df.format(Math.sqrt(Math.pow(Point2[0]-Point1[0],2.0)+
                Math.pow(Point2[1]-Point1[1],2.0)))
    }
    else
    {
        return "0.0 (Вы указали точки с одинаковыми координатами)"
    }
}
