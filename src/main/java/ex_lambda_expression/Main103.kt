package ex_lambda_expression

fun main(args: Array<String>) {
    val instantFunc:(Int) -> Unit
    instantFunc  = { number:Int ->
        println("Hello $number")
//        number + 10   // 만약 한문장이 이렇게 더 들어가면 맨 마지막 문장이 리터럴 값이 된다. return은 허용되지 않는다.
    }

    instantFunc(33)
    instantFunc.invoke(44)
}