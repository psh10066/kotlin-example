package org.example.ex11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    // apply와 동일하나, 마지막 라인이 return된다. 주로 지역 scope를 만들 때 많이 사용한다.
    val userDto = UserDto("").run {
        name = "홍길동"
        "empty"
    }
    println("result $userDto")

    val x = 10
    val sum = run {
        val x = 2
        val y = 3
        x + y
    }
    println(sum)

    val now: LocalDateTime? = null

    val d = now?.let {
        val minusTime = it.minusHours(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    } ?: run {
        val now = LocalDateTime.now()
        val minusTime = now.minusDays(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }

    println(d)
}