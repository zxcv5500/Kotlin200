package ex_smart_casts

fun main(args: Array<String>) {
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
}

fun checkNull(any: Any?) {
    if (any == null) {
        println("null이 들어왔습니다.")
        return
    }

    println(any.toString())     // any? 가 아닌 이유는 앞에서 null 검사를 했기 때문에 가능하다.
}
