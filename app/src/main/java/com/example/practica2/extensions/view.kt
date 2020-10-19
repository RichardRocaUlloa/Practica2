package com.example.practica2.extensions

import android.view.LayoutInflater
import android.view.ViewGroup

fun String.borrar():String = ""

fun ViewGroup.inflar(layot:Int)
        = LayoutInflater.from(context).inflate(layot, this, false)