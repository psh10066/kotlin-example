package org.example.ex18

import java.io.FileWriter

fun getStr(): Nothing = throw Exception("예외가 발생하여 기본값으로 초기화함")

fun main() {

    // java에서는 try with resources 방식으로 close해야 하나, kotlin에서는 use가 끝나면 close된다.
    FileWriter("test.txt")
        .use {
            it.write("Hello World!")
        }

    // catch의 마지막 줄 return
    val result = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }

    println(result)

    // try catch와 동일
    val result2 = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본값"
        }

    println(result2)

    // mapCatching의 경우 throw까지 대응 가능
    val result3 = runCatching { getStr() }
        .mapCatching {
            throw Exception("예외")
        }.getOrDefault("기본값")

    println(result3)

    // recover를 통해 실패 시 복구 가능
    val result4 = runCatching { getStr() }
        .recover {
            "복구"
        }.getOrNull()

    println(result4)

    // recoverCatching의 경우 recover 블록 내에서 throw까지 대응 가능
    val result5 = runCatching { getStr() }
        .recoverCatching {
            throw Exception("예외")
        }.getOrNull()

    println(result5)
}