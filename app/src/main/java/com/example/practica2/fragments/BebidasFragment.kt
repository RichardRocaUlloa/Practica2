package com.example.practica2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica2.R
import com.example.practica2.adapters.BebidasAdapter
import com.example.practica2.adapters.FrutasAdapter
import com.example.practica2.models.Bebidas
import com.example.practica2.models.Frutas
import kotlinx.android.synthetic.main.fragment_bebidas.*
import kotlinx.android.synthetic.main.fragment_frutas.*
import kotlinx.android.synthetic.main.fragment_frutas.rvFrutas


class BebidasFragment : Fragment() {

    private val bebidas:ArrayList<Bebidas> by lazy {getBebidas()}
    private lateinit var bebidasAdapter: BebidasAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bebidas, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }

    fun setRecycler(){
        rvBebidas.setHasFixedSize(true)
        rvBebidas.layoutManager = LinearLayoutManager(context)
        rvBebidas.itemAnimator = DefaultItemAnimator()
        bebidasAdapter = BebidasAdapter(bebidas)
        rvBebidas.adapter = bebidasAdapter

    }

    @JvmName("getBebidas1")
    fun getBebidas():ArrayList<Bebidas>{
        return object : ArrayList<Bebidas>(){
            init {
                clear()
                add(Bebidas("Manzana Chilena", "Importadas", "S/.5.00"))
                add(Bebidas("Papaya", "Recien Pañadas", "S/.6.00"))
                add(Bebidas("Platano", "De la Isla y de Ceda", "S/.4.00"))
                add(Bebidas("Mango", "Recien Pañadas", "S/.8.00"))
                add(Bebidas("Fresa", "Recien Pañadas", "S/.4.00"))
                add(Bebidas("Mandarina", "Recien Pañadas", "S/.4.00"))
                add(Bebidas("Naranja", "Recien Pañadas", "S/.5.00"))
                add(Bebidas("Pera", "Recien Pañadas", "S/.7.00"))
                add(Bebidas("Durazno", "Recien Pañadas", "S/.7.00"))
                add(Bebidas("Cereza", "Recien Pañadas", "S/.2.00"))


            }
        }
    }

}