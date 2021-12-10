package pe.edu.pucp.carpooling_pucp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesRutasBinding
import pe.edu.pucp.carpooling_pucp.models.ChoferModel
import pe.edu.pucp.carpooling_pucp.utils.RutasCardAdapter
import java.util.*
import kotlin.collections.ArrayList
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup


class PasajeroViajes_rutas : AppCompatActivity() , AdapterView.OnItemClickListener{

    //lateinit var adapter: BaseAdapter

    private lateinit var binding: ActivityPasajeroViajesRutasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesRutasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val list = setDataList()
        val recyclerView: RecyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RutasCardAdapter(list, this@PasajeroViajes_rutas::onItemClickHandler)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(false)

    }

    private fun onItemClickHandler(position:Int){
        val myIntent = Intent(this, PasajeroViajes_infoChofer::class.java)
        startActivity(myIntent)

    }

    private fun setDataList():ArrayList<ChoferModel>{
        var listItem : ArrayList<ChoferModel> = ArrayList()

        listItem.add(
            ChoferModel(
                "Juan Carlos",
                "Salgo desde Las Flores Paradero 10",
                R.drawable.man1,
                4,
                1.5.toFloat(),
                Date(2021,12,14,10,0,0),
                6.0
            )
        )

        listItem.add(
            ChoferModel(
                "Fernando Tarazona",
                "Parto del paradero 5 de Las Flores, Caja de agua. Luego volteo " +
                        "por la avenida Wiesse.",
                R.drawable.man2,
                4,
                4.5.toFloat(),
                Date(2021,12,14,12,0,0),
                6.0
            )
        )
        listItem.add(
            ChoferModel(
                "Paolo Macarlupu",
                "Salgo desde Los Jardines",
                R.drawable.man3,
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
                R.drawable.woman1,
                2,
                4.5.toFloat(),
                Date(2021,12,14,14,0,0),
                6.0
            )
        )


        return listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        return
    }



}



