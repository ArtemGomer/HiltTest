package me.gomer.feature2impl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.BundleCompat
import androidx.core.os.bundleOf
import me.gomer.feature2api.Feature2Arguments

class Feature2Fragment internal constructor(): Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature2, container, false)
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