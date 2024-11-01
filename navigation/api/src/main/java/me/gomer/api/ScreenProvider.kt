package me.gomer.api

interface ScreenProvider<A: NavigationArgument, S : AppScreen> {

    fun getScreen(arguments: A): S
}