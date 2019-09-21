package com.ampersanda.fragmentsmkcoding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentSad : Fragment() {

    companion object {
        fun newInstance(): FragmentSad {
            return FragmentSad()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sad, container, false)
    }
}