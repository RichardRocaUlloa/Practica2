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
import com.example.practica2.models.Bebidas
import kotlinx.android.synthetic.main.fragment_bebidas.*


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
                add(Bebidas(R.mipmap.inkacola,"InkaCola", "Personal", "S/.2.50"))
                add(Bebidas(R.mipmap.cocacola,"CocaCola", "Personal", "S/.2.50"))
                add(Bebidas(R.mipmap.pepsi,"Pepsi", "Personal", "S/.2.00"))
                add(Bebidas(R.mipmap.fanta,"Fanta", "Personal", "S/.2.00"))
                add(Bebidas(R.mipmap.sevenup,"7up", "Personal", "S/.2.00"))
                add(Bebidas(R.mipmap.tampico,"Tampico", "3 Litros", "S/.2.00"))
                add(Bebidas(R.mipmap.cifrut,"Cifrut", "3 Litros", "S/.2.00"))
                add(Bebidas(R.mipmap.agua,"Agua", "3 Litros", "S/.2.00"))
                add(Bebidas(R.mipmap.cerveza,"Cerveza", "Botella", "S/.7.00"))
                add(Bebidas(R.mipmap.volt,"Volt", "Personal", "S/.2.00"))


            }
        }
    }

}