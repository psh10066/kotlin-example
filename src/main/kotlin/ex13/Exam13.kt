package org.example.ex13

// object 키워드를 사용하는 것만으로 singleton 객체를 생성할 수 있다.
// java에서 static 용도로도 많이 사용한다.
object Singleton {

    val a = 1234

    fun printA() = println(a)
}

class MyClass private constructor() {

    // 동반 객체는 클래스 내부에서 생성되는 객체라고 보면 된다.
    // 내부에 변수 및 함수를 가질 수 있다.
    companion object {
        val a = 1234
        fun newInstance() = MyClass()
    }
}

fun main() {
    println(Singleton.a)
    Singleton.printA()

    println(MyClass.a)
    println(MyClass.newInstance())
}