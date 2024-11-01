package me.gomer.impl.navigation

import com.github.terrakok.cicerone.Screen
import me.gomer.api.AppScreen
import me.gomer.api.NavigationArgument

interface CiceroneScreen<N: NavigationArgument> : AppScreen {

    val ciceroneScreen: Screen
}