package com.ampersanda.fragmentsmkcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO : 1. RecyclerView
        recyclerView = findViewById(R.id.recycler_view)

        // TODO : 2. LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // TODO : 3. Adapter
        recyclerView.adapter = RecyclerAdapter(this,
            listOf(
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100),
                Siswa("Muhammad", "Jl Smea", 100)
            ), object : RecyclerAdapter.OnMyItemClickedListener {
                override fun myItemClicked(siswa: Siswa) {
                    Toast.makeText(this@MainActivity, siswa.nilai.toString(), Toast.LENGTH_SHORT)
                        .show()
                }

            })
    }
}
