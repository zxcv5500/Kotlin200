package ex_notnull_assertion_operator

import ex_member_function.Building

fun main(args: Array<String>) {
    var obj: Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
//    obj!!.print()     // 강제로 null을 지정하고 사용하려고 하면 error을 발생하는 것을 볼 수 있다.
}