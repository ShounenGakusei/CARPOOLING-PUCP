package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesSolicitudesBinding
import pe.edu.pucp.carpooling_pucp.models.ChoferModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCardAdapter
import pe.edu.pucp.carpooling_pucp.utils.SolicitudEnRutaCardAdapter
import java.util.*
import kotlin.collections.ArrayList

class choferViajes_Solicitudes : AppCompatActivity() , AdapterView.OnItemClickListener{
    private lateinit var binding: ActivityChoferViajesSolicitudesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesSolicitudesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idFrame:Int = binding.fragmentContainerView13.id
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = upperMenu()

        val mBundle = Bundle()
        mBundle.putBoolean("my_boolean",true)
        mFragment.arguments = mBundle
        mFragmentTransaction.add(idFrame, mFragment).commit()


        val listAceptados = setDataListAceptados()
        val recyclerViewAceptados: RecyclerView = binding.rvAceptados
        recyclerViewAceptados.layoutManager = LinearLayoutManager(this)
        val adapterA = SolicitudEnRutaCardAdapter(listAceptados, this@choferViajes_Solicitudes::onItemClickHandler)
        recyclerViewAceptados.adapter = adapterA


        val listPendientes = setDataListPendientes()
        val recyclerViewPendientes: RecyclerView = binding.rvPendientes
        recyclerViewPendientes.layoutManager = LinearLayoutManager(this)
        val adapterP = SolicitudEnRutaCardAdapter(listPendientes, this@choferViajes_Solicitudes::onItemClickHandler)
        recyclerViewPendientes.adapter = adapterP

        binding.btRegresar.setOnClickListener {
            val myIntent = Intent(this, ChoferViajes_Inicio::class.java)
            startActivity(myIntent)
        }
    }
    private fun setDataListAceptados():ArrayList<ChoferModel>{
        val listItem : ArrayList<ChoferModel> = ArrayList()

        listItem.add(
            ChoferModel(
                "Pedro del Campo",
                "Recogeme en Los Jardines",
                R.drawable.man2,
                1.5.toFloat(),
                1,
            )
        )
        return listItem

    }

    private fun setDataListPendientes():ArrayList<ChoferModel>{
        val listItem : ArrayList<ChoferModel> = ArrayList()

        listItem.add(
            ChoferModel(
                "Marco Aurelio",
                "Estaci??n Caja de Agua",
                R.drawable.man3,
                1.5.toFloat(),
                2,
            )
        )

        listItem.add(
            ChoferModel(
                "Maria Teresa",
                "Puedes recogerme en las FLores cuadra 8 porfis.",
                R.drawable.woman3,
                4.5.toFloat(),
                2,
            )
        )
        return listItem

    }


    private fun onItemClickHandler(position:Int){
        Log.d("Mensajes","$position")
    }
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        return
    }

}