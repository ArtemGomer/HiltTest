package me.gomer.impl.navigation.feature1

import me.gomer.api.AppRouter
import me.gomer.feature1api.Feature1Router
import me.gomer.feature2api.Feature2Arguments
import me.gomer.impl.navigation.CiceroneScreen
import me.gomer.impl.navigation.feature2.CiceroneFeature2Screen
import javax.inject.Inject

class CiceroneFeature1RouterImpl @Inject constructor(
    private val router: AppRouter<CiceroneScreen>,
) : Feature1Router {

    override fun goToFeature2(arguments: Feature2Arguments) {
        router.navigateTo(screen = CiceroneFeature2Screen(arguments = arguments))
    }
}