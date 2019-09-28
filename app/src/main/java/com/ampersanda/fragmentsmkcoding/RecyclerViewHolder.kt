package com.ampersanda.fragmentsmkcoding

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val button : Button = itemView.findViewById(R.id.button_item)
    val name : TextView = itemView.findViewById(R.id.tv_name)
    val address : TextView = itemView.findViewById(R.id.tv_address)
}