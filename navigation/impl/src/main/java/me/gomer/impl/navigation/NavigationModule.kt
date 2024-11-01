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
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    @Singleton
    fun bindCiceroneRouterToAppRouter(
        impl: CiceroneRouter
    ): AppRouter<CiceroneScreen>

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