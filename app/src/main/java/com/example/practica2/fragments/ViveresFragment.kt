package com.example.practica2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica2.R
import com.example.practica2.adapters.VerdurasAdapter
import com.example.practica2.adapters.ViveresAdapter
import com.example.practica2.models.Verduras
import com.example.practica2.models.Viveres
import kotlinx.android.synthetic.main.fragment_verduras.*
import kotlinx.android.synthetic.main.fragment_verduras.rvVerduras
import kotlinx.android.synthetic.main.fragment_viveres.*


class ViveresFragment : Fragment() {

    private val viveres:ArrayList<Viveres> by lazy {getViveres()}
    private lateinit var viveresAdapter: ViveresAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_viveres, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecycler()
    }
    fun setRecycler(){
        rvViveres.setHasFixedSize(true)
        rvViveres.layoutManager = LinearLayoutManager(context)
        rvViveres.itemAnimator = DefaultItemAnimator()
        viveresAdapter = ViveresAdapter(viveres)
        rvViveres.adapter = viveresAdapter
    }
    @JvmName("getViveres1")
    fun getViveres():ArrayList<Viveres>{
        return object : ArrayList<Viveres>(){
            init {
                clear()
                add(Viveres("Manzana Chilena", "Importadas", "S/.5.00"))
                add(Viveres("Papaya", "Recien Pañadas", "S/.6.00"))
                add(Viveres("Platano", "De la Isla y de Ceda", "S/.4.00"))
                add(Viveres("Mango", "Recien Pañadas", "S/.8.00"))
                add(Viveres("Fresa", "Recien Pañadas", "S/.4.00"))
                add(Viveres("Mandarina", "Recien Pañadas", "S/.4.00"))
                add(Viveres("Naranja", "Recien Pañadas", "S/.5.00"))
                add(Viveres("Pera", "Recien Pañadas", "S/.7.00"))
                add(Viveres("Durazno", "Recien Pañadas", "S/.7.00"))
                add(Viveres("Cereza", "Recien Pañadas", "S/.2.00"))


            }
        }
    }
}