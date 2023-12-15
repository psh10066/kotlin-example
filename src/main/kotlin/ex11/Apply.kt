package org.example.ex11

fun main() {

    // 생성자 패턴. 확장함수를 넘겨줄 수 있다.
    val userDto = UserDto().apply {
        // this를 써도 되고 안써도 된다.
        name = "홍길동"
        this.myUserDto()
    }

    println(userDto)
}

// Unit은 void의 Wrapper Class
fun UserDto.myUserDto(): Unit {
    println(this.name)
}