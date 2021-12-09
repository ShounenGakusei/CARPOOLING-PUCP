package pe.edu.pucp.carpooling_pucp

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesInfoChoferBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesPuntoOBinding

class PasajeroViajes_puntoO : AppCompatActivity() {
    private lateinit var binding:ActivityPasajeroViajesPuntoOBinding
    lateinit var adapter: ArrayAdapter<*>
    private lateinit var list: ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesPuntoOBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.listOrigenFavoritos
        list = setDataList()

        adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, list)
        listView.adapter = adapter


        listView.setOnItemClickListener { parent, view, position, id ->
            binding.txtOrigen.setText(list.get(position))
        }

        binding.btFinalizar.setOnClickListener{
            val myIntent = Intent(this, PasajeroViajes_confirmacion::class.java)
            startActivity(myIntent)
        }
    }

    private fun setDataList():ArrayList<String> {
        list = ArrayList()
        list.add("Mi casa en la cuadra 32 de Maria Av")
        list.add("Tu casa en la cuadra 32 de Maria Av")
        list.add("Nuestra casa en la cuadra 32 de Maria Av")
        list.add("Aquellas casa en la cuadra 32 de Maria Av")
        return list

    }
}