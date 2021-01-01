package com.mrozon.teamviewexample

import android.graphics.drawable.Drawable

data class Member (
    val name: String = "",
    val offense: Double = 0.0,
    val defense: Double = 0.0,
    val picture: Drawable? = null
)