package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesInicioBinding
import pe.edu.pucp.carpooling_pucp.models.RutasModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCardAdapter
import pe.edu.pucp.carpooling_pucp.utils.RutasSimpleCardAdapter
import java.util.*
import kotlin.collections.ArrayList

private const val MY_BOOLEAN = "my_boolean"
class ChoferViajes_Inicio : AppCompatActivity() {

    private lateinit var binding: ActivityChoferViajesInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idFrame:Int = binding.fragmentContainerView11.id
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = upperMenu()

        val mBundle = Bundle()
        mBundle.putBoolean("my_boolean",true)
        mFragment.arguments = mBundle
        mFragmentTransaction.add(idFrame, mFragment).commit()

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
                "Ruta 01",
                "Salgo desde Las Flores Paradero 10, paso por todo Flores y Caja de Agua",
                Date(2021,12,14,8,0,0),
                2,
                4,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba","Teo")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 02",
                "Salgo desde Las Flores Paradero 10, paso por todo Flores y Caja de Agua",
                Date(2021,12,14,12,0,0),
                1,
                3,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba","Teo")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 03",
                "Salgo desde Las Flores Paradero 10, paso por todo Flores y Caja de Agua",
                Date(2021,12,14,16,0,0),
                1,
                2,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Pumba")
            )
        )


        listItem.add(
            RutasModel(
                null,
                "Ruta 04",
                "Salgo desde Las Flores Paradero 10",
                Date(2021,12,14,20,0,0),
                2,
                2,
                "San Juan de Lurigancho",
                listOf("Juan", "Pepe"),
                listOf("Simon","Teo")
            )
        )


        return listItem
    }
}