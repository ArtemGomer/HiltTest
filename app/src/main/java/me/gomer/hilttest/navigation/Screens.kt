package me.gomer.hilttest.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import me.gomer.feature2api.Feature2Arguments
import me.gomer.feature2impl.Feature2Fragment

object Screens {

    fun feature2Screen(arguments: Feature2Arguments) =
        FragmentScreen { Feature2Fragment.create(arguments = arguments) }

}