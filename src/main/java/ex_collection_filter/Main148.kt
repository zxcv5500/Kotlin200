package ex_collection_filter

fun main() {
    val to50 = 1..50

    println(to50.filter { it % 4 == 0 })
    println(to50.filterNot { it % 4 == 0 })
    println(to50.filterNotNull())
    println(to50.filterIndexed { index, element -> element > 20 })
    println(to50.filterIsInstance<Long>())      // Long 타입에 맞는 애만 걸러내는데 Int타입 밖에 없으므로 [] 출력됨.
}