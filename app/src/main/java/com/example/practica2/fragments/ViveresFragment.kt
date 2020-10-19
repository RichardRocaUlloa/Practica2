package com.example.practica2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica2.R
import com.example.practica2.adapters.ViveresAdapter
import com.example.practica2.models.Viveres
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
                add(Viveres(R.mipmap.arroz,"Arroz", "Kilo", "S/.3.00"))
                add(Viveres(R.mipmap.azucar,"Azucar", "Kilo", "S/.5.00"))
                add(Viveres(R.mipmap.sal,"Sal", "Paquete", "S/.4.00"))
                add(Viveres(R.mipmap.fideos,"Fideos", "Cuarto", "S/.1.00"))
                add(Viveres(R.mipmap.harina,"Harina", "Cuarto", "S/.1.00"))
                add(Viveres(R.mipmap.chuno,"Chuño", "Cuarto", "S/.1.00"))
                add(Viveres(R.mipmap.leche,"Leche", "Lata", "S/.3.00"))
                add(Viveres(R.mipmap.atun,"Atun Lata", "Lata", "S/.5.00"))
                add(Viveres(R.mipmap.aceite,"Aceite", "Litro", "S/.5.00"))
                add(Viveres(R.mipmap.huevos,"Huevos", "Kilo", "S/.6.00"))


            }
        }
    }
}