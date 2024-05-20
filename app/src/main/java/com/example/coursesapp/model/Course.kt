package com.example.coursesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val id: Int
)
