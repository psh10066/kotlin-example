package org.example.ex12

// open 키워드로 상속이 가능한 상태로 만든다.
open class Dog {

    // 변수나 함수에 open 키워드를 사용해야 override할 수 있다.
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

open class Bulldog : Dog() {

    // override한 변수나 함수는 자동으로 open 상태가 된다.
    override var age: Int = 1

    // override한 변수나 함수는 final 키워드로 open을 막을 수 있다.
    final override fun bark() {
        super.bark()
    }
}

class ChildBulldog(override var age: Int = 2) : Bulldog()

fun main() {
    val bulldog = Bulldog()
    val childBulldog = ChildBulldog()

    println(bulldog.age)
    println(childBulldog.age)
}