package ru.appngo.tankstutorial.utils

import android.view.View
import ru.appngo.tankstutorial.HORIZONTAL_MAX_SIZE
import ru.appngo.tankstutorial.VERTICAL_MAX_SIZE
import ru.appngo.tankstutorial.models.Coordinate

fun View.checkViewCanMoveThroughBorder(coordinate: Coordinate): Boolean {
    if (coordinate.top >= 0
        && coordinate.top + this.height <= HORIZONTAL_MAX_SIZE
        && coordinate.left >= 0
        && coordinate.left + this.width <= VERTICAL_MAX_SIZE
    ) {
        return true
    }
    return false
}
