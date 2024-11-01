package me.gomer.impl.navigation.feature2

import me.gomer.api.AppRouter
import me.gomer.feature1api.Feature1Router
import me.gomer.feature2api.Feature2Arguments
import me.gomer.feature2api.Feature2Router
import me.gomer.impl.navigation.CiceroneScreen
import me.gomer.impl.navigation.feature1.CiceroneFeature1Screen
import me.gomer.impl.navigation.feature2.CiceroneFeature2Screen
import javax.inject.Inject

class CiceroneFeature2RouterImpl @Inject constructor(
    private val router: AppRouter<CiceroneScreen>,
) : Feature2Router {

    override fun goToFeature1() {
        router.navigateTo(screen = CiceroneFeature1Screen)
    }
}