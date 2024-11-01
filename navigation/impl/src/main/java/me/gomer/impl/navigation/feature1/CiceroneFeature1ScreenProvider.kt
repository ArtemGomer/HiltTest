package me.gomer.impl.navigation.feature1

import me.gomer.api.NoArguments
import me.gomer.feature1api.Feature1ScreenProvider
import javax.inject.Inject

class CiceroneFeature1ScreenProvider @Inject constructor(): Feature1ScreenProvider<CiceroneFeature1Screen> {

    override fun getScreen(arguments: NoArguments): CiceroneFeature1Screen =
        CiceroneFeature1Screen
}