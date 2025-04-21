package com.lannstark.lec02

//코틀린과 자바는 100% 상호 호환이 가능하기 때문에 Person 클래스의 @Nullable 어노테이션을 코틀린은 읽을 수 있음
//자바에서 null 이 가능한 속성을 코틀린 null 가능하지 않은 변수에 넣으면 컴파일 에러가 나는 것을 알 수 있다.

//문제는 @NotNull 도 없고 @Nullable 정보도 없는 속성이라면
//Kotlin 에서는 이 값이 nullable 인지 non-nullable 인지 알 수 없음
//이렇게 코틀린이 Null 관련 정보를 알 수 없는 타입을 플랫폼 타입이라고 함
//Runtime 시 Exception 이 발생할 수 있음
fun main() {
    val person = Person(null)
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

/*
Lec 02. 코틀린에서 null 을 다루는 방법
- 코틀린에서 null 이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
    - 한 번 Null 검사를 하면 non-null 임을 컴파일러가 알 수 있다.
- null 이 아닌 경우에만 호출되는 Safe Call (?.) 이 있다.
- null 인 경우에만 호출되는 Elvis 연산자 (?:) 가 있다.
- null 이 절대 아닐 때 사용할 수 잇는 널 아님 단언 (!!) 이 있다.
- Kotlin 에서 Java 코드를 사용할 때 플랫폼 타입 사용에 유의해야 한다.
    - Java 코드를 읽으며 널 가능성 확인 / kotlin 으로 wrapping 해서 단일지점으로 사용하면 이슈 대응에 좋다.
 */