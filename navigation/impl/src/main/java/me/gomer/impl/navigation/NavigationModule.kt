package me.gomer.impl.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.gomer.api.AppRouter
import me.gomer.feature1api.Feature1ScreenProvider
import me.gomer.feature2api.Feature2ScreenProvider
import me.gomer.impl.navigation.feature1.CiceroneFeature1Screen
import me.gomer.impl.navigation.feature1.CiceroneFeature1ScreenProvider
import me.gomer.impl.navigation.feature2.CiceroneFeature2Screen
import me.gomer.impl.navigation.feature2.CiceroneFeature2ScreenProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    @Singleton
    fun bindCiceroneRouterToAppRouter(
        impl: CiceroneRouter
    ): AppRouter<CiceroneScreen>

    @Binds
    @Singleton
    fun bindCiceroneFeature2ScreenProviderToFeature2ScreenProvider(
        impl: CiceroneFeature2ScreenProvider
    ): Feature2ScreenProvider<CiceroneFeature2Screen>


    @Binds
    @Singleton
    fun bindCiceroneFeature1ScreenProviderToFeature1ScreenProvider(
        impl: CiceroneFeature1ScreenProvider
    ): Feature1ScreenProvider<CiceroneFeature1Screen>

    companion object {

        @Provides
        @Singleton
        fun provideCicerone(): Cicerone<Router> = Cicerone.create()


        @Provides
        @Singleton
        fun provideRouter(cicerone: Cicerone<Router>): Router = cicerone.router

        @Provides
        @Singleton
        fun provideNavigatorHolder(cicerone: Cicerone<Router>): NavigatorHolder =
            cicerone.getNavigatorHolder()
    }
}