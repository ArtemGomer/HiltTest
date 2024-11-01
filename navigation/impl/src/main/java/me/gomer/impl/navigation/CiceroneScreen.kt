package me.gomer.impl.navigation

import com.github.terrakok.cicerone.Screen
import me.gomer.api.AppScreen

interface CiceroneScreen : AppScreen {

    val ciceroneScreen: Screen
}