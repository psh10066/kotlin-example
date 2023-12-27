package org.example.ex11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    // run와 동일하나, 일반적인 함수형으로 작성한다. (문법 차이)
    val userDto = with(UserDto("")) {
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