package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesRutasBinding
import pe.edu.pucp.carpooling_pucp.models.ChoferModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCardAdapter
import java.util.*
import kotlin.collections.ArrayList

class PasajeroViajes_rutas : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var adapter: RutasCardAdapter? =null
    private var arrayList:ArrayList<ChoferModel>?= null

    private lateinit var binding: ActivityPasajeroViajesRutasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesRutasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.listRutasDistrito
        arrayList = ArrayList()
        arrayList = setDataList()
        adapter = RutasCardAdapter(applicationContext, arrayList!!)
        listView.adapter = adapter

        binding.btRegresar.setOnClickListener {
            val myIntent = Intent(this, PasajeroViajes_infoChofer::class.java)
            startActivity(myIntent)
        }

        listView.setOnItemClickListener { parent, view, position, id ->
            val myIntent = Intent(this, PasajeroViajes_infoChofer::class.java)
            startActivity(myIntent)
        }

    }


    private fun setDataList():ArrayList<ChoferModel>{
        var listItem : ArrayList<ChoferModel> = ArrayList()

        listItem.add(
            ChoferModel(
                "Juan Carlos",
                "LLego a la PUCP55",
                R.drawable.logo,
                4,
                1.5.toFloat(),
                Date(2021,12,14,10,0,0),
                6.0
            )
        )

        listItem.add(
            ChoferModel(
                "Pepe Lucas",
                "LLego a la PUCP44 ",
                R.drawable.logo,
                4,
                4.5.toFloat(),
                Date(2021,12,14,12,0,0),
                6.0
            )
        )
        listItem.add(
            ChoferModel(
                "Simon Dice",
                "LLego a la PUCP 11",
                R.drawable.logo,
                1,
                2.5.toFloat(),
                Date(2021,12,14,13,0,0),
                6.0
            )
        )
        listItem.add(
            ChoferModel(
                "Maria Felipe",
                "LLego a la PUCP 32",
                R.drawable.logo,
                2,
                4.5.toFloat(),
                Date(2021,12,14,14,0,0),
                6.0
            )
        )


        return listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var item: ChoferModel = arrayList?.get(position)!!
        Toast.makeText(applicationContext, item.nombre, Toast.LENGTH_LONG).show()
        val myIntent = Intent(this, PasajeroViajes_infoChofer::class.java)
        startActivity(myIntent)
    }
}