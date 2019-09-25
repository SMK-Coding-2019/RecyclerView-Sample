package com.ampersanda.fragmentsmkcoding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HappyBirthdayFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_happy_birthday, container, false)
    }

    companion object {
        fun newInstance(): HappyBirthdayFragment {
            return HappyBirthdayFragment()
        }
    }
}
