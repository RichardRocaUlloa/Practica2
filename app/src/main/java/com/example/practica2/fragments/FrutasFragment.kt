package com.example.practica2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica2.R
import com.example.practica2.adapters.FrutasAdapter
import com.example.practica2.models.Frutas
import kotlinx.android.synthetic.main.fragment_frutas.*


class FrutasFragment : Fragment() {

    private val frutas:ArrayList<Frutas> by lazy {getFrutas()}
    private lateinit var frutasAdapter:FrutasAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frutas, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }
    fun setRecycler(){
        rvFrutas.setHasFixedSize(true)
        rvFrutas.layoutManager = LinearLayoutManager(context)
        rvFrutas.itemAnimator = DefaultItemAnimator()
        frutasAdapter = FrutasAdapter(frutas)
        rvFrutas.adapter = frutasAdapter

    }

    @JvmName("getFrutas1")
    fun getFrutas():ArrayList<Frutas>{
        return object : ArrayList<Frutas>(){
            init {
                clear()
                add(Frutas(R.mipmap.manzana,"Manzana Chilena", "Importadas", "S/.5.00"))
                add(Frutas(R.mipmap.papaya,"Papaya", "Recien Pañadas", "S/.6.00"))
                add(Frutas(R.mipmap.platano,"Platano", "De la Isla y de Ceda", "S/.4.00"))
                add(Frutas(R.mipmap.mango,"Mango", "Recien Pañadas", "S/.8.00"))
                add(Frutas(R.mipmap.fresa,"Fresa", "Recien Pañadas", "S/.4.00"))
                add(Frutas(R.mipmap.mandarina,"Mandarina", "Recien Pañadas", "S/.4.00"))
                add(Frutas(R.mipmap.naranja,"Naranja", "Recien Pañadas", "S/.5.00"))
                add(Frutas(R.mipmap.pera,"Pera", "Recien Pañadas", "S/.7.00"))
                add(Frutas(R.mipmap.durazno,"Durazno", "Recien Pañadas", "S/.7.00"))
                add(Frutas(R.mipmap.cereza,"Cereza", "Recien Pañadas", "S/.2.00"))


            }
        }

    }


}