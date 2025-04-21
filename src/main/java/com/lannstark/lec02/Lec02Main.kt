package com.lannstark.lec02

fun main() {
    val str: String? = null
    //safe call
    //null 이면 str?.length 전체가 null 처리 됨.
    println(str?.length)

    //Elvis 연산자
    //앞의 연산 결과가 null 이면 뒤의 값을 사용
    val str1: String? = null
    println(str?.length ?: 0)

}

fun startsWithA1(str: String?): Boolean {
    if(str == null) {
        throw IllegalArgumentException("null")
    }

    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if(str == null) {
        return false;
    }
    return str.startsWith("A")
}