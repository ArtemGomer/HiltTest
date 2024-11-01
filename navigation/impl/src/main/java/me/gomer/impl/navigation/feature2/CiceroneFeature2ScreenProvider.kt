package me.gomer.impl.navigation.feature2

import me.gomer.api.ScreenProvider
import me.gomer.feature2api.Feature2Arguments
import javax.inject.Inject

class CiceroneFeature2ScreenProvider @Inject constructor() :
    ScreenProvider<Feature2Arguments, CiceroneFeature2Screen> {

    override fun getScreen(arguments: Feature2Arguments): CiceroneFeature2Screen =
        CiceroneFeature2Screen(arguments = arguments)
}