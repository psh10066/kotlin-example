package org.example.ex16

class HelloBot {

    // 변수의 불변성을 유지하면서 초기화를 실행 시점으로 미룬다.
    val greeting: String by lazy {
        println("초기화 수행")
        getHello()
    }

    fun sayHello() = println(greeting)

    // 변수 초기화를 미룬다. 보통 DI를 위해 자주 사용한다. (Autowired)
    lateinit var text: String

    fun printText() {
        if (this::text.isInitialized) {
            println("이미 초기화됨")
        } else {
            text = "안녕하세요2"
        }
        println(text)
    }
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    for (i in 1..5) {
        // by lazy는 기본적으로 멀티 스레드 환경에서도 안전하도록 설계되어 있다.
        // LazyThreadSafetyMode 속성으로 변경 가능
        Thread {
            helloBot.sayHello()
        }.start()
    }

    helloBot.printText()
    helloBot.printText()
}