package me.gomer.impl.navigation

import com.github.terrakok.cicerone.Router
import me.gomer.api.AppRouter
import javax.inject.Inject

class CiceroneRouter @Inject constructor(
    private val router: Router
) : AppRouter<CiceroneScreen> {

    override fun navigateTo(screen: CiceroneScreen) {
        router.navigateTo(screen = screen.ciceroneScreen)
    }
}