package ex_exponential_function

import kotlin.math.exp
import kotlin.math.expm1
import kotlin.math.pow
import kotlin.math.sqrt

// 지수 함수
fun main(args: Array<String>) {
    println(sqrt(2.0))          // 제곱근
    println(2.0.pow(0.5))       // x 제곱을 반환하는  pow확장함수
    println(exp(2.0))           // e_x 값을 반환
    println(expm1(2.0))         // e_x -1값 봔환
}