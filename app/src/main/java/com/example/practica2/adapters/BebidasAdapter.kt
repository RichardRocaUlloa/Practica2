package com.example.practica2.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica2.R
import com.example.practica2.extensions.inflar
import com.example.practica2.models.Bebidas
import kotlinx.android.synthetic.main.row_bebidas.view.*

class BebidasAdapter (private val bebidas:List<Bebidas>)
    : RecyclerView.Adapter<BebidasAdapter.BebidasHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BebidasHolder(parent.inflar(R.layout.row_bebidas))

    override fun onBindViewHolder(holder: BebidasHolder, position: Int) =
        holder.bind(bebidas[position])

    override fun getItemCount() = bebidas.size

    class BebidasHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(bebidas: Bebidas) = with(itemView) {
            ivBebidas.setImageResource(bebidas.imagen)
            tvBebidasNombre.text = bebidas.nombre
            tvBebidasDescripcion.text = bebidas.descripcion
            tvBebidasPrecio.text = bebidas.precio
        }
    }
}