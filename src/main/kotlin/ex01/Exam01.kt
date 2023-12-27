package org.example.ex01

// 함수 바깥 또는 클래스 바깥에서 변수 선언 가능 ("Top Level에 위치한다"라고 함)
var x = 5

// Class 없이 main 메소드만 만들어줘도 인식한다.
fun main() {

    // 세미콜론은 찍지 않아도 된다.

    // var > mutable object (가변 객체), val > immutable object (불변 객체)
    val name: String = "홍길동"
    var _name: String = "홍길동"

    // 타입 추론이 가능하여 타입을 지정하지 않아도 된다.
    val n = "홍길동"
    // 타입이 고정된 이후 타입 변경은 불가능
    // n = 20 // error

    // 지연 할당 시에는 타입을 지정해줘야 한다.
    val s: String
    // val s2 // error

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

    // 범위 연산자 ..을 사용하는 for loop
    for (j in 0..3) {
        println(j)
    }

    // until을 사용해 반복한다. (마지막 숫자는 포함하지 않음)
    for (j in 0 until 3) {
        println(j)
    }

    // step에 들어온 값만큼 증가시킨다.
    for (j in 0..6 step 2) {
        println(j)
    }

    // 반복하면서 값을 감소시킨다.
    for (j in 3 downTo 1) {
        println(j)
    }
}

// 함수 몸통 생략 가능, 몸통 생략 시 타입 추론 가능
fun sum(a: Int, b: Int) = a + b

// 함수 몸통 존재 시 타입 추론 불가능
fun sum2(a: Int, b: Int) {
    // return a + b // error
}