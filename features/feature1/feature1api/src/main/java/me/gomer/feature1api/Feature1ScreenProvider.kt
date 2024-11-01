package me.gomer.feature1api

import me.gomer.api.AppScreen
import me.gomer.api.NoArguments
import me.gomer.api.ScreenProvider

interface Feature1ScreenProvider<S : AppScreen> : ScreenProvider<NoArguments, S>