package org.example.ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    Exam08(Store())

    println(DateTimeUtil().localDateTimeToString())
}

data class Store(
    var registerAt: LocalDateTime? = null
)

class Exam08 {

    constructor(store: Store) {
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime)

        println(toLocalDateTimeString())
    }

    // return type은 메소드 뒤에 적어줌
    fun toLocalDateTimeString(localDateTime: LocalDateTime? = LocalDateTime.of(2020, 2, 2, 13, 0, 0)): String {
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {

    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),
        pattern: String = KST_FORMAT
    ): String {
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(pattern))
    }
}