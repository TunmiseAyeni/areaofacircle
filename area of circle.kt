//program to calculate the area of a circle
import kotlin.math.PI

fun main
{
    println("This Program is to calculate the area of a circle")
    println("Enter the value for Radius: ")
    val radius = readln().toDouble()
    val area: Double = PI*radius*radius
    print("The area of the circle is: $area" )
    val formatNum = string.format(%.2f, area)
    print("The area rounded up to 2s.f is: $formatNum")
}