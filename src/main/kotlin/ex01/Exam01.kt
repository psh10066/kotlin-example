package org.example.ex01

// Class 없이 main 메소드만 만들어줘도 인식한다.
fun main() {

    // 세미콜론은 찍지 않아도 된다.

    // var > mutable object (가변 객체), val > immutable object (불변 객체)
    val name: String = "홍길동"
    var _name: String = "홍길동"

    // 타입 추론이 가능하여 타입을 지정하지 않아도 된다.
    val n = "홍길동"

    // primitive type이 없고, 모두 reference type이다. (모든 것이 객체)
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f: Float = 10f

    var b: Boolean = true

    // print 문법이 간단하다.
    println(name)

    // $ 표시로 변수 매칭이 가능하다.
    val result = "사용자의 이름은 : $name"
    println(result)

    // ${}를 통해 코드 작성이 가능하다.
    val result2 = "사용자의 이름은 : ${if (true) name else null}"
    println(result2)
}