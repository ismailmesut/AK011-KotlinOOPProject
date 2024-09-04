package com.ismailmesutmujde.kotlinoopproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User sınıfından myUser objesi oluşturuldu.
        var myUser = User("James", 50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)

        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())
        james.returnBandName("ismail")
        james.returnBandName("kirk")
    }
}