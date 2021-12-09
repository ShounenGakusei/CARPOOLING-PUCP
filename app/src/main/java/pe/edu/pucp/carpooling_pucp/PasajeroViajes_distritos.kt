package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesDistritosBinding


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

        list = ArrayList()
        list.add("Apple")
        list.add("Banana")
        list.add("Pineapple")
        list.add("Orange")
        list.add("Mango")
        list.add("Grapes")
        list.add("Lemon")
        list.add("Melon")
        list.add("Watermelon")
        list.add("Papaya")
        list.add("Apple")
        list.add("Banana")
        list.add("Pineapple")
        list.add("Orange")
        list.add("Mango")
        list.add("Grapes")
        list.add("Lemon")
        list.add("Melon")
        list.add("Watermelon")
        list.add("Papaya")
        list.add("Apple")
        list.add("Banana")
        list.add("Pineapple")
        list.add("Orange")
        list.add("Mango")
        list.add("Grapes")
        list.add("Lemon")
        list.add("Melon")
        list.add("Watermelon")
        list.add("Papaya")


        //setSupportActionBar(binding.toolbar4)
        adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->  val myIntent = Intent(this, PasajeroViajes_rutas::class.java)
            startActivity(myIntent)}

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

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item: String = list?.get(position)!!
        Toast.makeText(applicationContext, item, Toast.LENGTH_LONG).show()
        val myIntent = Intent(this, PasajeroViajes_rutas::class.java)
        startActivity(myIntent)
    }
}