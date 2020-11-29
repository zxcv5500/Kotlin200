package ex_mutable_list_iterator_interface

fun main() {
    val list = mutableListOf<Int>(1, 2, 3)
    val iter: MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next()
    iter.next()
    iter.add(7)
    println(list)

    iter.next()
    iter.set(10)
    println(list)

}