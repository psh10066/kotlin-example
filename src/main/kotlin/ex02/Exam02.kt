package org.example.ex02

fun main() {

    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    callFunction()
}

// ? > 엘비스 연산자 (null이 올 수도 있다는 뜻)
// = > 매개변수 없는 경우 기본값 설정 가능
fun callFunction(i: Int? = 100) {

    println(i)

    // 변수?. > 변수가 null이 아닐 때
    // 변수?: > 변수가 null일 때
    i?.let {
        // it : 해당 변수를 나타냄
        println(it)
    } ?: run {
        println("null 값입니다.")
        println("null 값입니ㄴ다.")
    }

    // 삼항 연산자가 없고, if else를 써야 한다.
    val temp = if (i == null) "null 값입니다." else i
    println(temp)

    // i가 null일 때 간단히 지정하는 문법
    val temp2 = i ?: "null 값입니다."
    println(temp2)

    val temp3 = i?.let { it * 20 } ?: "null 값입니다."
    println(temp3)

    println("========================================")
}