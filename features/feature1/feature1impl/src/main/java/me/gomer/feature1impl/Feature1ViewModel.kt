package me.gomer.feature1impl

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import me.gomer.feature1api.Feature1Router
import me.gomer.feature2api.Feature2Arguments
import javax.inject.Inject

@HiltViewModel
internal class Feature1ViewModel @Inject constructor(
    private val feature1Navigator: Feature1Router
) : ViewModel() {

    fun navigate(number: Int) {
        feature1Navigator.goToFeature2(arguments = Feature2Arguments(argument = number))
    }

}