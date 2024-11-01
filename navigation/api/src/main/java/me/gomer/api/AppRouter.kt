package me.gomer.api

interface AppRouter<S: AppScreen>{

    fun navigateTo(screen: S)
}