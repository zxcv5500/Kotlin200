package ex_generic_several_type

fun <T, R> T.map(mapper: (T) -> R): R
{
    return mapper(this)
}

fun main(args: Array<String>) {
    val square: Int = 11.map {
        it * it
    }

    val square2: Int = 11.map<Int, Int> {
        it * it
    }

    println(square)
}