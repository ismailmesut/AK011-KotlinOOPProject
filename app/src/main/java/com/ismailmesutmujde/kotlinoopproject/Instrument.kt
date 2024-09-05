package com.ismailmesutmujde.kotlinoopproject

interface Instrument {

    // kotlin -> ister body oluyor, ister body olmuyor
    // java -> body yok, override edilmesi gerekiyor
    fun info() {
        println("instrument info")
    }
}