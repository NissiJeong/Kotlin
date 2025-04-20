package com.lannstark.lec01

fun main() {
    var number1 : Long = 10L
    number1 = 5L
    val number2 = 10L
    // number2 = 5L 불가능

    var number3 : Long
    // println(number3); 오류
    number3 = 5
    println(number3)

    val number4 : Long
    number4 = 10L
    println(number4)

    var number5 = 1
    number5 = 32
}