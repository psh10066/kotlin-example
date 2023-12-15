package org.example.ex07

fun main() {

    val user = User()
    user.name = "홍길동"
    user.age = 10
    user.email = "gmail"

    // 객체 복사
    val user2 = user.copy(name = "이순신") // named arguments

    // Kotlin Fill Class 플러그인 설치 후 괄호에서 Alt + Enter를 통해 named arguments 자동 생성 가능
    val user3 = User(
        name = "이순신",
        age = 30,
        email = "gmail.com"
    )

    println(user)
    println(user2)
    println(user3)
}