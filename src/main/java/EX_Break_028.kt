fun main(args: Array<String>) {
    var i = 0
    while (true) {
        i += 1
        if (i >= 5)
            break       // 이 문장이 실행되는 순간 while 블록을 탈출한다
        println(i)
    }
}