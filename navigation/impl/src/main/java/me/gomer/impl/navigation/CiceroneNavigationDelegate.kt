package me.gomer.impl.navigation

import androidx.fragment.app.FragmentActivity
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import me.gomer.api.NavigationDelegate
import javax.inject.Inject

class CiceroneNavigationDelegate @Inject constructor(
    private val context: FragmentActivity,
    private val navigatorHolder: NavigatorHolder,
) : NavigationDelegate {

    private lateinit var navigator: Navigator

    override fun onCreate(containerId: Int) {
        navigator = AppNavigator(context, containerId)
    }

    override fun onResumeFragments() {
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
    }
}