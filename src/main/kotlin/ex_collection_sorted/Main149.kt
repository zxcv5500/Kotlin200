package ex_collection_sorted

fun main() {
    val list = listOf(43, 76, 28, 19, 22, 68)

    println(list.sorted())
    println(list.sortedDescending())

    val list2 = mutableListOf<Int>()
    list2.addAll(list.sortedDescending())
    println(list2)
}