package com.cherkina.grade_clicker.model

import androidx.annotation.DrawableRes

data class Grade (
    @DrawableRes val imageId: Int,
    val pointsClick: Int,
    val threshold:Int
)