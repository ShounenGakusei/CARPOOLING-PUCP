package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesInicioBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesRutasBinding
import pe.edu.pucp.carpooling_pucp.models.ChoferModel
import pe.edu.pucp.carpooling_pucp.models.RutasModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCardAdapter
import pe.edu.pucp.carpooling_pucp.utils.RutasSimpleCardAdapter
import java.util.*
import kotlin.collections.ArrayList

class ChoferViajes_Inicio : AppCompatActivity() {

    private lateinit var binding: ActivityChoferViajesInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = setDataList()
        val recyclerView: RecyclerView = binding.recycleViewRutas

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RutasSimpleCardAdapter(list, this@ChoferViajes_Inicio::onItemClickHandler)

        recyclerView.adapter = adapter

        binding.btAgregarViaje.setOnClickListener {
            val myIntent = Intent(this, ChoferViajes_Registrar::class.java)
            startActivity(myIntent)
        }
    }

    private fun onItemClickHandler(position:Int){
        val myIntent = Intent(this, choferViajes_Solicitudes::class.java)
        startActivity(myIntent)

    }
    private fun setDataList():ArrayList<RutasModel>{


        val listItem : ArrayList<RutasModel> = ArrayList()

        listItem.add(
            RutasModel(
                null,
                "Ruta 32",
                "Paso pro toda la universitaria",
                Date(2021,12,14,10,0,0),
                3,
                5,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba","Teo")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 36",
                "Paso pro toda la universitaria",
                Date(2021,12,14,10,0,0),
                3,
                5,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba","Teo")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 39",
                "Paso pro toda la universitaria",
                Date(2021,12,14,10,0,0),
                3,
                5,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 22",
                "Paso pro toda la universitaria",
                Date(2021,12,14,10,0,0),
                3,
                5,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Teo")
            )
        )


        return listItem
    }
}