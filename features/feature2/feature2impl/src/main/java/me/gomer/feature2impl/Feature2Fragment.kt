package me.gomer.feature2impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.BundleCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import me.gomer.feature2api.Feature2Arguments
import me.gomer.feature2impl.databinding.FragmentFeature2Binding

class Feature2Fragment internal constructor() : Fragment() {

    private var _viewBinding: FragmentFeature2Binding? = null
    private val viewBinding: FragmentFeature2Binding
        get() = requireNotNull(_viewBinding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentFeature2Binding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arguments = BundleCompat.getSerializable(
            requireArguments(),
            ARGUMENTS_KEY,
            Feature2Arguments::class.java
        )

        view.findViewById<TextView>(R.id.text).text =
            "Number from feature1 = ${arguments?.argument ?: ""}"

    }

    override fun onDestroyView() {
        _viewBinding = null
        super.onDestroyView()
    }

    companion object {

        private const val ARGUMENTS_KEY = "ARGUMENTS_KEY"

        fun create(arguments: Feature2Arguments): Feature2Fragment {
            val fragment = Feature2Fragment().apply {
                this.arguments = bundleOf(ARGUMENTS_KEY to arguments)
            }
            return fragment
        }

    }
}