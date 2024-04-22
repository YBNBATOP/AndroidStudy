package com.example.gridcourses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Course (
    @StringRes val nameResource: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResource: Int
)

