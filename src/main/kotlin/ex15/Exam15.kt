package org.example.ex15

class MyGenerics<out T>(val t: T)

class Bag<T> {
    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}

fun main() {
    // 타입 추론 가능
    val generics = MyGenerics("test")

    // 변수의 타입에 제네릭을 사용한 경우
    val list1: MutableList<String> = mutableListOf()

    // type argument를 생성자에서 추가
    val list2 = mutableListOf<String>()

    // 타입을 모르는 경우
    val list3: List<*>

    // PECS > Producer-Extends, Consumer-Super
    // 공변성 > T’가 T의 서브타입이면, C<T’>는 C<out T>의 서브타입이다.
    // 반공변성 > T’가 T의 서브타입이면, C<T>는 C<in T’>의 서브타입이다.
    // 무공변성 > C와 C<T’>는 아무 관계가 없다.

    // 공변성 > java extends > kotlin out
    val charGenerics: MyGenerics<CharSequence> = generics

    // 반공변성 > java super > kotlin in
    val bag = Bag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3, 4"))
}