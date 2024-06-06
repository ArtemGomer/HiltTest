package me.gomer.feature1impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import me.gomer.feature1impl.databinding.FragmentFeature1Binding

@AndroidEntryPoint
class Feature1Fragment internal constructor() : Fragment() {

    private val viewModel by viewModels<Feature1ViewModel>()

    private var _viewBinding: FragmentFeature1Binding? = null
    private val viewBinding: FragmentFeature1Binding
        get() = requireNotNull(_viewBinding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentFeature1Binding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.button.setOnClickListener {
            viewModel.navigate(number = 2)
        }
    }

    override fun onDestroyView() {
        _viewBinding = null
        super.onDestroyView()
    }

}