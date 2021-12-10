package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesDistritosBinding
import pe.edu.pucp.carpooling_pucp.models.ChoferModel


class PasajeroViajes_distritos : AppCompatActivity() , AdapterView.OnItemClickListener{

    private lateinit var list: ArrayList<String>
    lateinit var adapter: ArrayAdapter<*>
    lateinit var searchView: SearchView

    private lateinit var binding: ActivityPasajeroViajesDistritosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesDistritosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        searchView = binding.searchView
        val listView = binding.listViewDistirtos

        list = setDataList()


        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter


        listView.setOnItemClickListener { parent, view, position, id -> val myIntent = Intent(this, PasajeroViajes_rutas::class.java)
            startActivity(myIntent) }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                if (list.contains(query)) {
                    adapter.filter.filter(query)
                } else {
                    Toast.makeText( applicationContext,"No Match found", Toast.LENGTH_LONG).show()
                }
                return false
            }
            override fun onQueryTextChange(newText: String): Boolean {
                adapter.filter.filter(newText)
                return false
            }
        })
    }

    private fun setDataList():ArrayList<String> {
        list = ArrayList()
        list.add("Ancon")
        list.add("Ate")
        list.add("Barranco")
        list.add("Carabayllo")
        list.add("Chaclacayo")
        list.add("Chorrillos")
        list.add("Cieneguilla")
        list.add("Comas")
        list.add("Independencia")
        list.add("Lince")
        list.add("Miraflores")
        list.add("Pueblo libre")
        list.add("Puente piedra")
        list.add("San Juan de Lurigancho")
        list.add("Santa Anita")
        list.add("Santa Rosa")
        list.add("Surco")
        list.add("Surquillo")


        return list
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        return
    }

}