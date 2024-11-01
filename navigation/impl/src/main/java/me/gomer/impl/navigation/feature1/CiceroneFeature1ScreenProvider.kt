package me.gomer.impl.navigation.feature1

import me.gomer.api.NoArguments
import me.gomer.api.ScreenProvider
import javax.inject.Inject

class CiceroneFeature1ScreenProvider @Inject constructor() :
    ScreenProvider<NoArguments, CiceroneFeature1Screen> {

    override fun getScreen(arguments: NoArguments): CiceroneFeature1Screen =
        CiceroneFeature1Screen
}