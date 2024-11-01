package me.gomer.impl.navigation.feature2

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import me.gomer.feature2api.Feature2Router

@Module
@InstallIn(ViewModelComponent::class)
interface Feature2NavigationModule {

    @Binds
    @ViewModelScoped
    fun bindCiceroneFeature1RouterImplToFeature1Router(impl: CiceroneFeature2RouterImpl): Feature2Router
}