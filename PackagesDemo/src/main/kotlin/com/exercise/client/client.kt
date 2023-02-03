package com.exercise.client

import com.exercise.hello.sayHi

fun getName(){
    println("Please enter a client name")
    val name = readLine()?:""
    sayHi(name)
}