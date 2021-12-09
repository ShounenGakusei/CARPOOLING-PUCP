package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesAgregarRutaBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding

class ChoferViajes_AgregarRuta : AppCompatActivity() {
    private lateinit var binding: ActivityChoferViajesAgregarRutaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesAgregarRutaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAgregarRuta2.setOnClickListener{
            //TODO deberia agregar la ruta ala lista para asi mostrarlo
            val myIntent = Intent(this, ChoferViajes_registrarRuta::class.java)
            startActivity(myIntent)
        }

    }
}