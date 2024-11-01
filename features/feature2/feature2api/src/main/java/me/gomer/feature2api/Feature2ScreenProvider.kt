package me.gomer.feature2api

import me.gomer.api.AppScreen
import me.gomer.api.ScreenProvider

interface Feature2ScreenProvider<S: AppScreen> : ScreenProvider<Feature2Arguments, S>