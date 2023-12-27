package org.example.ex06

fun main() {

    // new 키워드 없이 생성자 호출
    val dog = Dog("해피")

    // 보편적으로 getter, setter 없이 직접 property 접근
    println(dog.age)
    dog.age = 20
    println(dog.age)

    println(dog.weight)

    dog.eat()
    dog.bark()
    println(dog.defaultHiString)
    dog.defaultHi()
}

interface Bark {
    fun bark()
}

interface Temp {
    fun hi()

    // interface 내에서 property 생성 시 몸통이 없는 getter만 default로 생성 가능하다.
    val defaultHiString : String
        get() = "hi"

    fun defaultHi() {
        println(defaultHiString)
    }
}

abstract class Animal(
    private val name: String
) : Bark {
    fun eat() {
        println("$name 식사 시작")
    }
}

// extends, implements 구분 없이 : 로 상속받는다.
class Dog(
    private val name: String,
    var age: Int = 0
) : Animal(name), Temp {

    // getter, setter의 기본 구조는 아래와 같으나, 기본적으로 세팅됨
    var weight: Int = 0
        get() = field
        set(value) {
            field = value
        }

    override fun bark() {
        println("$name : 멍멍")
    }

    override fun hi() {
        println("$name : hi")
    }
}