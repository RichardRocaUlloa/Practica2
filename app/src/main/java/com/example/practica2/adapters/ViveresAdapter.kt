package com.example.practica2.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica2.R
import com.example.practica2.extensions.inflar
import com.example.practica2.models.Viveres
import kotlinx.android.synthetic.main.row_viveres.view.*

class ViveresAdapter (private val viveres:List<Viveres>)
    : RecyclerView.Adapter<ViveresAdapter.ViveresHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViveresHolder(parent.inflar(R.layout.row_viveres))

    override fun onBindViewHolder(holder: ViveresHolder, position: Int) =
        holder.bind(viveres[position])

    override fun getItemCount() = viveres.size

    class ViveresHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun bind(viveres: Viveres) = with(itemView) {
            ivViveres.setImageResource(viveres.imagen)
            tvViveresNombre.text = viveres.nombre
            tvViveresDescripcion.text = viveres.descripcion
            tvViveresPrecio.text = viveres.precio
        }
    }
}