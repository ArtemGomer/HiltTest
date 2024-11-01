package me.gomer.impl.navigation.feature1

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import me.gomer.feature1api.Feature1Router

@Module
@InstallIn(ViewModelComponent::class)
interface Feature1NavigationModule {

    @Binds
    @ViewModelScoped
    fun bindCiceroneFeature1RouterImplToFeature1Router(impl: CiceroneFeature1RouterImpl): Feature1Router
}