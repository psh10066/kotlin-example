package org.example.ex11

import java.time.LocalDateTime

fun main() {

    val now = LocalDateTime.now()
    val localDateTime: LocalDateTime? = null

    // let > NPE 회피, 특정 스코프 안에서 다른 값 반환 위해 사용
    val kst = now?.let { localDateTime: LocalDateTime ->
        println("let scope $localDateTime")
        "let scope" // 마지막 라인에 있는 값이 return됨 (return 문법 사용 불가)
    } ?: LocalDateTime.now()

    println("result $kst")

    UserDto(name = "홍길동").let {
        logic(it)
    }

    val userDtoList = listOf(UserDto(name = "홍길동"), UserDto(name = "이순신"))

    // Collection에서 쓰는건 map, 객체에서 쓰는건 let
    val responseList = userDtoList.map {
        UserResponse(userName = it.name)
    }.toList()

    println(responseList)
}

fun logic(userDto: UserDto?): UserResponse? {

    // 변수 선언 없으면 it 예약어로 사용할 수 있다.
    return userDto?.let {
        println("dto $it")

        UserEntity(
            name = it.name
        )
    }?.let {
        println("entity $it")

        UserResponse(
            userName = it.name
        )
    }
}

data class UserDto(
    var name: String? = null
)

data class UserEntity(
    var name: String? = null
)

data class UserResponse(
    var userName: String? = null
)