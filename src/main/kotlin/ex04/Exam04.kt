package org.example.ex04

fun main() {

    // java Object == kotlin Any
    val map = mapOf<String, Any>(
        Pair("key1", "value1"),
        "key2" to "value2",
    )

    val mutableMap = mutableMapOf(
        "key1" to "value2"
    )

    mutableMap["key2"] = "value2"
    val value = mutableMap["key1"]

    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}