package org.example.ex03

fun main() {

    // mutable list
    val userList = mutableListOf<User>()
    userList.add(User("1", 10))
    userList.add(User("2", 20))
    userList.add(User("3", 30))

    // immutable list. 초기화 때 넣지 않으면 수정이 불가능.
    // java에서의 immutable list는 add 등의 수정 메소드가 제공되나 사용 시 오류가 발생하고, kotlin에서는 그러한 메소드 자체가 없다.
    val list = userList

    for (element in userList) {
        println(element)
    }

    userList.forEach { println(it) }

    userList.forEachIndexed { index, user -> println("index : $index, user  : $user") }

    for ((index, user) in userList.withIndex()) {
        println("index : $index, user  : $user")
    }
}

class User(
    var name: String,
    var age: Int
)