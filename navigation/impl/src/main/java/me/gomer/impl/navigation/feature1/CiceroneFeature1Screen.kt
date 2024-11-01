package me.gomer.impl.navigation.feature1

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen
import me.gomer.feature1impl.Feature1Fragment
import me.gomer.impl.navigation.CiceroneScreen

data object CiceroneFeature1Screen : CiceroneScreen {

    override val ciceroneScreen: Screen = FragmentScreen {
        Feature1Fragment.create()
    }
}