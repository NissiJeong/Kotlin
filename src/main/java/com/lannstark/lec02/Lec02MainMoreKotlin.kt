package com.lannstark.lec02

fun main() {
    println(startsWith("ABC"))
}

fun startsWithA1K(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null")
}

fun startWithA2k(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3k(str: String?): Boolean {
    return str?.startsWith("A")?: false
}

//Elvis 연산자를 활용한 early return
fun calculate(number: Long?) : Long {
    // number 가 null 인 경우 뒤의 값을 사용하여 리턴
    /*
    자바의 아래 코드와 동일한 코드
    if(number == null) {
        return 0;
    }
     */
    number?:return 0

    return 1
}

//null 아님 단언!!
//혹시나 null이 들어오면 NPE가 나오기 때문에
//정말 null이 아닌게 확실한 경우에만 널 아님 단언!! 을 사용해야 함
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}