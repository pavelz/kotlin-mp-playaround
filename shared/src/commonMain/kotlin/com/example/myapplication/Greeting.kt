package com.example.myapplication

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        println("HOO BOY")
        return "Hello, ${platform.name}!"
    }
}