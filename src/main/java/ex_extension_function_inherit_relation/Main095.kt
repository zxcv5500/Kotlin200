package ex_extension_function_inherit_relation

open class AAA; class BBB: AAA()

fun AAA.hello() = println("AAA")        // 확장함수는 멤버함수와는 다르게 참조변수의 타입을 그대로 따른다.
fun BBB.hello() = println("BBB")

fun main(args: Array<String>) {
    val test: AAA = BBB()
    test.hello()
}