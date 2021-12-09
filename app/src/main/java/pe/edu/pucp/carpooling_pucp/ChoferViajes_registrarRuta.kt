package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesRegistrarBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesRegistrarRutaBinding
import pe.edu.pucp.carpooling_pucp.models.RutasModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCreadasCardAdapder
import pe.edu.pucp.carpooling_pucp.utils.RutasSimpleCardAdapter
import java.util.*
import kotlin.collections.ArrayList

class ChoferViajes_registrarRuta : AppCompatActivity() {
    private lateinit var binding: ActivityChoferViajesRegistrarRutaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesRegistrarRutaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = setDataList()
        val recyclerView: RecyclerView = binding.rvRutasCreadas

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RutasCreadasCardAdapder(list, this@ChoferViajes_registrarRuta::onItemClickHandler)
        recyclerView.adapter = adapter



        binding.btAgregarRuta.setOnClickListener{
            val myIntent = Intent(this, ChoferViajes_AgregarRuta::class.java)
            startActivity(myIntent)
        }

    }
    private fun onItemClickHandler(position:Int){
        //-TODO  Debe devolver el nombre de la ruta
        val myIntent = Intent(this, ChoferViajes_Registrar::class.java)
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