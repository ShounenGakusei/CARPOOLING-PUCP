package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesInfoChoferBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesPuntoOBinding

class PasajeroViajes_puntoO : AppCompatActivity() {
    private lateinit var binding:ActivityPasajeroViajesPuntoOBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesPuntoOBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btFinalizar.setOnClickListener{
            val myIntent = Intent(this, PasajeroViajes_confirmacion::class.java)
            startActivity(myIntent)
        }
    }
}