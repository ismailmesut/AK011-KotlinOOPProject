package com.ismailmesutmujde.kotlinoopproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User sınıfından myUser objesi oluşturuldu.
        var myUser = User()
        //myUser.age = 25
        //myUser.name = "James"

        println(myUser.age.toString())
        println(myUser.name)
    }
}