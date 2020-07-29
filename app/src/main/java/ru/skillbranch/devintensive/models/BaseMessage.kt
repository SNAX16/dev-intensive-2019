package com.example.dev_intensive.models

import java.util.*


abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()

) {
    abstract fun formatMessage():String
    companion object AbstractFactory{
        var lastId = -1
        fun makeMessage(from: User?, chat: Chat, date: Date= Date(), type:String="String", payload:Any?):BaseMessage{
            lastId++
            return when(type){
                "image"->ImageMessage("$lastId", from,chat,date = Date(),image = payload as String)
                else-> TextMessage("$lastId", from,chat,date = Date(),text = payload as String)

            }
        }
    }
}