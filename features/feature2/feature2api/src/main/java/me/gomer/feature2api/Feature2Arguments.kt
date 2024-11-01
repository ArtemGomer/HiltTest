package me.gomer.feature2api

import me.gomer.api.NavigationArgument
import java.io.Serializable

data class Feature2Arguments(
    val argument: Int
) : NavigationArgument, Serializable
