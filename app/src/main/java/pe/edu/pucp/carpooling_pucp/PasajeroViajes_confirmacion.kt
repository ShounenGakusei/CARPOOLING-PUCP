package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesConfirmacionBinding

class PasajeroViajes_confirmacion : AppCompatActivity() {
    private lateinit var binding: ActivityPasajeroViajesConfirmacionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesConfirmacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btFinalizar.setOnClickListener {
            val myIntent = Intent(this, PasajeroViajes_distritos::class.java)
            startActivity(myIntent)
        }
    }
}