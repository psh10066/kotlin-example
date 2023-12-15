package org.example.ex11

fun main() {

    val userDto = UserDto(
        name = "홍길동"
    ).also { dto: UserDto ->
        println(dto)

        // let과는 다르게 받아온 객체 그대로 return
        UserDto(
            name = "이순신"
        )
    }

    println("result $userDto")
}