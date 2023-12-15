package org.example.ex05

import java.util.function.Predicate

fun main() {

    var numberList = listOf(1, 2, 3, 4, 5)

    // 익명 클래스를 만들 때 object 키워드를 사용한다.
    val predicate = object : Predicate<Int> {
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }
    numberList.stream().filter(predicate)

    numberList.filter { it % 2 == 0 }

    numberList.map { it * 2 }

    // java에서는 functional interface가 있어야만 메소드를 넘길 수 있다.
    val add = { x: Int, y: Int -> x + y }
    println(add.invoke(2, 3))

    val _add = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(_add(3, 4))

    lambda(4, 5, _add)
}

fun lambda(x: Int, y: Int, method: (Int, Int) -> Int) {
    println(method(x, y))
}