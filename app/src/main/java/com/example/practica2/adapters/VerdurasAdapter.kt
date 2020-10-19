package com.example.practica2.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica2.R
import com.example.practica2.extensions.inflar
import com.example.practica2.models.Verduras
import kotlinx.android.synthetic.main.row_verduras.view.*

class VerdurasAdapter (private val verduras:List<Verduras>)
    : RecyclerView.Adapter<VerdurasAdapter.VerdurasHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VerdurasHolder(parent.inflar(R.layout.row_verduras))

    override fun onBindViewHolder(holder: VerdurasHolder, position: Int) =
        holder.bind(verduras[position])

    override fun getItemCount() = verduras.size

    class VerdurasHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(verduras: Verduras) = with(itemView) {
            tvVerdurasNombre.text = verduras.nombre
            tvVerdurasDescripcion.text = verduras.descripcion
            tvVerdurasPrecio.text = verduras.precio
        }
    }
}