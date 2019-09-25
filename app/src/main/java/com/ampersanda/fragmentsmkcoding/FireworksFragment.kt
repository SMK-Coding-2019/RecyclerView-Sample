package com.ampersanda.fragmentsmkcoding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FireworksFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fireworks, container, false)
    }

    companion object {
        fun newInstance(): FireworksFragment {
            return FireworksFragment()
        }
    }
}
