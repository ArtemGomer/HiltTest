package me.gomer.impl.navigation.feature2

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import me.gomer.feature2api.Feature2Arguments
import me.gomer.feature2impl.Feature2Fragment
import me.gomer.impl.navigation.CiceroneScreen

data class CiceroneFeature2Screen(
    val arguments: Feature2Arguments
) : CiceroneScreen {

    override val ciceroneScreen: Screen
        get() = FragmentScreen {
            Feature2Fragment.create(arguments = arguments)
        }
}