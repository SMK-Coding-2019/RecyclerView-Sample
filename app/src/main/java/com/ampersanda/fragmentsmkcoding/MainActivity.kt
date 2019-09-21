package com.ampersanda.fragmentsmkcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment()

        findViewById<View>(R.id.fragment_frame).setOnClickListener {
            counter++
            changeFragment()
        }
    }

    private fun changeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(
            R.id.fragment_frame,
            if (counter % 2 == 0) FragmentSad.newInstance() else FragmentSmile.newInstance()
        )

        transaction.commit()
    }
}
