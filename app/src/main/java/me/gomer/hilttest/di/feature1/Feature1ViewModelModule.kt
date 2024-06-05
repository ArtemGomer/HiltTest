package me.gomer.hilttest.di.feature1

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import me.gomer.feature1api.Feature1Router
import me.gomer.hilttest.navigation.feature1.Feature1RouterImpl

@Suppress("UNUSED")
@Module
@InstallIn(ViewModelComponent::class)
interface Feature1ViewModelModule {

    @Binds
    @ViewModelScoped
    fun bindFeature1RouterImplToFeature1Router(impl: Feature1RouterImpl): Feature1Router

}