package com.ismailmesutmujde.kotlinoopproject

class Musician (name: String, instrument: String, age: Int) {

    // encapsulation
    private var name : String? = name
        private set
        get

    private var instrument : String? = instrument

    var age : Int? = age
        get
        private set

    private val bandName : String = "Metallica"
    fun returnBandName(password: String) : String {
        if (password=="ismail") {
            return bandName
        } else {
            return "Wrong password!"
        }
    }
}