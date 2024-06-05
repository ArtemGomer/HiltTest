package me.gomer.hilttest.navigation.feature1

import com.github.terrakok.cicerone.Router
import me.gomer.feature1api.Feature1Router
import me.gomer.feature2api.Feature2Arguments
import me.gomer.hilttest.navigation.Screens
import javax.inject.Inject

class Feature1RouterImpl @Inject constructor(
    private val router: Router
) : Feature1Router {

    override fun goToFeature2(arguments: Feature2Arguments) {
        router.navigateTo(Screens.feature2Screen(arguments = arguments))
    }
}