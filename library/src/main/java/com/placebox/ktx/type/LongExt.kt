package com.placebox.ktx.type

fun Long?.toLongOrZero() = this ?: 0L
fun Long?.isNullOrZero() = this == null || this == 0L
