package org.example.ex10

fun main() {

    val user = ExamUser(name = "abcd")
    exam10(user)
}

fun exam10(examUser: ExamUser?) {

    if (examUser.isNotNull() && examUser?.name.isNotNullOrBlank()) {
        println(examUser?.name)
    }
}

data class ExamUser(
    var name: String? = null
)

// extension function (이미 만들어진 클래스에 메소드 추가)
fun String?.isNotNullOrBlank(): Boolean {
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean {
    return this != null
}