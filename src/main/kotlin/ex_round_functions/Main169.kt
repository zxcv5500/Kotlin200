package ex_round_functions

import kotlin.math.*

fun main(args: Array<String>) {
    // 올림
    print("${ceil(3.2)} ")
    print("${ceil(3.7)} ")

    // 내림
    print("${floor(3.2)} ")
    print("${floor(3.7)} ")

    // 반올림
    print("${round(3.2)} ")
    print("${round(3.7)} ")
    
    // 반올림 확장 함수
    print("${15.83.roundToInt()}")
    print("${37842.45.roundToLong()}")
}