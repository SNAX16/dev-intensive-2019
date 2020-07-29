package com.example.dev_intensive.models

object Utils {
    //TODO FIX ME!!!
    fun parsFullName(fullName:String?):Pair<String?,String?> {
        val parts: List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return firstName to lastName
    }

    fun transliteration(payload: String, divider:String = " "): String {
      TODO("уще  один метод пока хз  зачем")
    }

    fun toInitials(firstName: String?, lastName: String?): String {
     TODO("функция вывода иницыалов")
    }


}