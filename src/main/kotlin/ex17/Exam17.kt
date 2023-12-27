package org.example.ex17

// FP에서 값이 두 개가 들어가는 tuple이 필요한 경우 따로 클래스를 만들지 않고 Pair로 사용할 수 있다.
fun plus(pair: Pair<Int, Int>): Int = pair.first + pair.second

fun main() {

    val plus = plus(Pair(1, 3))
    println(plus)

    val pair = Pair("A", 1)
    val newPair = pair.copy(first = "B")
    println(newPair)

    // newPair.second와 같음
    val second = newPair.component2()
    println(second)

    val list = newPair.toList()
    println(list)

    // 세 개가 들어가는 경우 Triple을 사용할 수 있다.
    val triple = Triple("A", "B", "C")
    println(triple)

    val (a: String, b: String, c: String) = triple
    println("$a, $b, $c")

    val list2 = triple.toList()
    val (a1, b1, c1) = list2
    println("$a1, $b1, $c1")

    val mutableMap = mutableMapOf(
        Pair("key1", "value1"),
        "key2" to "value2"
    )

    println(mutableMap)
}