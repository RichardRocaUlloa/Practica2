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
import com.example.practica2.models.Verduras
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
                add(Verduras(R.mipmap.lechuga,"Lechuga", "Frescos", "S/.1.00"))
                add(Verduras(R.mipmap.tomate,"Tomate", "Frescos", "S/.1.00"))
                add(Verduras(R.mipmap.zanahoria,"Zanahoria", "Frescos", "S/.2.00"))
                add(Verduras(R.mipmap.papa,"Papa", "Frescos", "S/.1.80"))
                add(Verduras(R.mipmap.camote,"Camote", "Frescos", "S/.2.00"))
                add(Verduras(R.mipmap.yuca,"Yuca", "Frescos", "S/.3.00"))
                add(Verduras(R.mipmap.peregil,"Peregil", "Frescos", "S/.0.50"))
                add(Verduras(R.mipmap.culantro,"Culantro", "Frescos", "S/.0.50"))
                add(Verduras(R.mipmap.pepinillo,"Pepinillo", "Frescos", "S/.1.00"))
                add(Verduras(R.mipmap.kion,"Kion", "Frescos", "S/.0.30"))


            }
        }
    }

}