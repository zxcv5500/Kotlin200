package ex_null

// 업캐스팅 예제의 Person클래스 재활용
import ex_upcasting.Person

fun main(args: Array<String>) {
    var person: Person? = Person("K", 30)
    person = null

    var num:Int? = null
    num = 10
}