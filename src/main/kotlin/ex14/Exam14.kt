package org.example.ex14

// sealed 클래스는 하위 클래스를 제한 조건에 따라 정의해야 한다.
// sealed 클래스의 하위 클래스가 어떠한 게 있는지 컴파일러가 알 수 있다.
// sealed를 abstract로 변경하면 when 절에서 else가 없어서 컴파일 오류가 발생한다.
sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("백엔드 $name : $language")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("프론트엔드 $name : $language")
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
    }

    fun get(name: String) = pool[name]
}