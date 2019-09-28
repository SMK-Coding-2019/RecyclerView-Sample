package com.ampersanda.fragmentsmkcoding

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(
    var context: Context,
    var listSiswa: List<Siswa>,
    var onMyItemClicked: OnMyItemClickedListener
) : RecyclerView.Adapter<RecyclerViewHolder>() {

    // TODO : 1. interface
    // TODO : 2. set listener
    interface OnMyItemClickedListener {
        fun myItemClicked(siswa: Siswa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutView: View = LayoutInflater.from(context)
            .inflate(R.layout.list_item, parent, false)
        return RecyclerViewHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return listSiswa.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.name.text = listSiswa[position].nama
        holder.address.text = listSiswa[position].alamat

        holder.button.setOnClickListener {
            onMyItemClicked.myItemClicked(listSiswa[position])
        }
    }

}
