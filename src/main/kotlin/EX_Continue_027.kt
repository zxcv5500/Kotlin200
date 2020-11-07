fun main(args: Array<String>) {
    var i = 0
    while (i < 10) {
        i += 1
        if (i % 2 == 0)
            continue // continue 아래의 문장들을 모두 skip한다
        print(i)
    }
}