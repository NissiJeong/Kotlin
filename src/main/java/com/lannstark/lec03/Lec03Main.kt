package com.lannstark.lec03

fun main() {
    val number = 3
    val number2: Long = number.toLong()

    val number1: Int? = 3
    val number3: Long = number1?.toLong() ?: 0L

    printAgeIfPerson2(Person("111", 20))
}

fun printAgeIfPerson(obj: Any) {
    if(obj is Person) {
        val person = obj as Person
        println(person.age)
        // 스마트 캐스트
        // 코틀린 컴파일러가 is 로 타입 확인할 때 타입을 추론하게 됨
        val person1 = obj
        println(person1.age)
        println(obj.age)
    }
    else if(obj !is Person) {
        println("이런식으로 코드 짤 수 있음, !is")
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
}
