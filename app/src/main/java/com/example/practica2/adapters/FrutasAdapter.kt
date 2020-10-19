package com.example.practica2.adapters

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica2.R
import com.example.practica2.extensions.inflar
import com.example.practica2.models.Frutas
import kotlinx.android.synthetic.main.row_frutas.view.*

class FrutasAdapter (private val frutas:List<Frutas>)
    :RecyclerView.Adapter<FrutasAdapter.FrutasHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = FrutasHolder(parent.inflar(R.layout.row_frutas))

    override fun onBindViewHolder(holder: FrutasHolder, position: Int)
        = holder.bind(frutas[position])

    override fun getItemCount() = frutas.size

    class FrutasHolder(item:View):RecyclerView.ViewHolder(item){
        fun bind(frutas:Frutas) = with(itemView){
            ivFrutas.setImageResource(frutas.imagen)
            tvFrutasNombre.text = frutas.nombre
            tvFrutasDescripcion.text = frutas.descripcion
            tvFrutasPrecio.text = frutas.precio
        }
    }



}