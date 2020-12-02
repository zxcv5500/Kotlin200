package ex_triple

fun calculateCircle(radius: Int): Triple<Int, Double, Double> =
        Triple(radius * 2, radius.toDouble(), 3.14 * radius * radius)

fun main(args: Array<String>) {
    val (diameter, radius1, area) = calculateCircle(5)
    val abc = calculateCircle(10)
    abc.first
    abc.second
    abc.third
    println("지름:$diameter")
    println("반지름:$radius1")
    println("넓이:$area")

    println("지름:${abc.first}")
    println("반지름:${abc.second}")
    println("넓이:${abc.third}")
}