package ex_invoke_operator

fun main(args: Array<String>) {
    val product = Product(762443, "코틀린200제")
    product(108)
//    product(108, "Hi")
}
