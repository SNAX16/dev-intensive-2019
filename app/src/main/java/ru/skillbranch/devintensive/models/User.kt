package com.example.dev_intensive.models

import java.util.*

data class User (
    val id:String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String?,
    var rating:Int = 0,
    var respect:Int = 0,
    var lastVisit:Date? = null,
    var isOnline:Boolean = false
){
    constructor( id:String, firstName:String?, lastName:String?): this(id, firstName, lastName, null)

    constructor(id: String):this(id, "Jone","Doe")

    init {

        println("It's Alive!!!\n"+
                "${if(lastName==="Doe") "Nic name id: $firstName $lastName" else "and hise name $firstName $lastName"}\n")
    }
    companion object Factory{
        private  var lastId: Int = -1
        fun makeUser(fullName:String?):User{
            lastId++

            val (firstName,lastName) = Utils.parsFullName(fullName)
            return  User(id = "$lastId",firstName = firstName,lastName = lastName)
        }
    }
}