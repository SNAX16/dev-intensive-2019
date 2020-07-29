package com.example.dev_intensive.extensions

import com.example.dev_intensive.models.User
import com.example.dev_intensive.models.UserView
import com.example.dev_intensive.models.Utils
import java.util.*

fun User.toUserView(): UserView {
//    val nickName = Utils.transliteration("$firstName $lastName")
 //   val initials = Utils.toInitials(firstName, lastName)
    val status = if (lastVisit == null) "еще ни разу не был" else if (isOnline) "онлайн" else "последний раз был"
// ${lastVisit?.humanizeDiff()}
    return UserView(
        id,
        fullName = "$firstName $lastName",
        avatar = "$avatar",
        nickName = "nickName",
        initials = "initials",
        status = status )
}


