package com.ismailmesutmujde.kotlinoopproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User sınıfından myUser objesi oluşturuldu.
        // constructor
        var myUser = User("James", 50)
        myUser.name = "Lars"
        myUser.age = 60

        println(myUser.age.toString())
        println(myUser.name)

        // encapsulation
        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())
        println(james.returnBandName("ismail"))
        println(james.returnBandName("kirk"))

        // inheritance
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("ismail"))
        lars.sing()

        // polymorphism

        // static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3, 4))
        println(mathematics.sum(3, 4, 5))

        // dynamic polymorphism
        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

    }
}