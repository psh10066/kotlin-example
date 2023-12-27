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

    // asSequence : java의 stream과 같은 개념. 인라인 함수는 각각마다 개별 객체를 생성하지만, asSequence는 최종 컬렉션만 생성한다.
    // 데이터가 5~10만건 정도는 asSequence를 사용하지 않는 것이 퍼포먼스적으로 낫다고 한다.
    // 체인이나 다루는 데이터가 많은 경우 asSequence를 통해 메모리 이슈를 방지할 수 있다.
    numberList = numberList
        .asSequence()
        .filter { it * 2 == 0 }
        .map { it * 2 }
        .toList()

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