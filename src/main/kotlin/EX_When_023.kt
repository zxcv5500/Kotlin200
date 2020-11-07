fun main(args: Array<String>) {
    val score = 64
    when (score / 10) {
        6 -> { println('D')}
        7 -> { println('C') }
        8 ->  println('B')      // 문장이 하나일 때는 { } 중괄호를 생략해
        9, 10 -> { println('A')}
        else -> println('F')
    }

    println("test")
}