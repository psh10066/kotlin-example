package org.example.ex07

// java의 @Data 와 같은 기능
data class User(
    var name: String? = null,
    var age: Int? = null,
    var email: String? = null
)
