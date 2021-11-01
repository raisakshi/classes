package com.example.classeskotlin

import androidx.core.app.Person

fun main(){
    /* creating instance of classes */
    var sakshi = Person("sakshi,rai")
    sakshi.hobby = " singing"
    sakshi.stateHobby()
    var john = Person()
    john.hobby = " playing basketball"
    john.stateHobby()
    var jhonrai = Person(lastName = "rai")
    jhonrai.hobby = " reading book "
    jhonrai.stateHobby()
    }

 class Person (firstName : String = "john", lastName : String = "doe"){
    // Member Variables - Properties
     var age : Int? = null
    var hobby : String = " watch Netflix"
    init {

        println("Initialized a new Person object with"+"firstName =$firstName and lastName = $lastName")
    }
    // Member Function - Method
     fun stateHobby (){
         println(" My Hobby is $hobby")
     }
    }

