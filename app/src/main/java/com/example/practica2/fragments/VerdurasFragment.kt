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
import com.example.practica2.adapters.VerdurasAdapter
import com.example.practica2.models.Frutas
import com.example.practica2.models.Verduras
import kotlinx.android.synthetic.main.fragment_frutas.*
import kotlinx.android.synthetic.main.fragment_frutas.rvFrutas
import kotlinx.android.synthetic.main.fragment_verduras.*


class VerdurasFragment : Fragment() {

    private val verduras:ArrayList<Verduras> by lazy {getVerduras()}
    private lateinit var verdurasAdapter: VerdurasAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verduras, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }
    fun setRecycler(){
        rvVerduras.setHasFixedSize(true)
        rvVerduras.layoutManager = LinearLayoutManager(context)
        rvVerduras.itemAnimator = DefaultItemAnimator()
        verdurasAdapter = VerdurasAdapter(verduras)
        rvVerduras.adapter = verdurasAdapter
    }
    @JvmName("getVerduras1")
    fun getVerduras():ArrayList<Verduras>{
        return object : ArrayList<Verduras>(){
            init {
                clear()
                add(Verduras("Manzana Chilena", "Importadas", "S/.5.00"))
                add(Verduras("Papaya", "Recien Pañadas", "S/.6.00"))
                add(Verduras("Platano", "De la Isla y de Ceda", "S/.4.00"))
                add(Verduras("Mango", "Recien Pañadas", "S/.8.00"))
                add(Verduras("Fresa", "Recien Pañadas", "S/.4.00"))
                add(Verduras("Mandarina", "Recien Pañadas", "S/.4.00"))
                add(Verduras("Naranja", "Recien Pañadas", "S/.5.00"))
                add(Verduras("Pera", "Recien Pañadas", "S/.7.00"))
                add(Verduras("Durazno", "Recien Pañadas", "S/.7.00"))
                add(Verduras("Cereza", "Recien Pañadas", "S/.2.00"))


            }
        }
    }

}