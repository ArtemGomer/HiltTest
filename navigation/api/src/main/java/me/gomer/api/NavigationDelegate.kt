package me.gomer.api

interface NavigationDelegate {

    fun onCreate(containerId: Int)

    fun onResumeFragments()

    fun onPause()
}