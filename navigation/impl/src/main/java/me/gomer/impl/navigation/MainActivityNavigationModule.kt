package me.gomer.impl.navigation

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import me.gomer.api.NavigationDelegate

@Module
@InstallIn(ActivityComponent::class)
interface MainActivityNavigationModule {

    @Binds
    @ActivityScoped
    fun bindCiceroneNavigationDelegateToNavigationDelegate(
        impl: CiceroneNavigationDelegate
    ): NavigationDelegate
}