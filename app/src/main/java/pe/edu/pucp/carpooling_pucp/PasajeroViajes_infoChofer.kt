package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.pucp.carpooling_pucp.databinding.ActivityPasajeroViajesInfoChoferBinding

class PasajeroViajes_infoChofer : AppCompatActivity() {
    private lateinit var binding:ActivityPasajeroViajesInfoChoferBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasajeroViajesInfoChoferBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgFotoConductor.setImageResource(R.drawable.man1)
        binding.txtPlaca.text =  " Placa: FBS-G27"
        binding.txtColor.text =  "Modelo: Blanco"
        binding.txtModelo.text = " Color: Toyota"
        binding.txtNombConductor.text = "Juan Carlos"
        binding.txtDescripcion.text = "Salgo desde Las Flores Paradero 10, paso por todo Flores y Caja de Agua"
        binding.txtVehiculo.text = "Descripcion del vehiculo"
        binding.imgMediosPago.setImageResource(R.drawable.mediospago)
        binding.imgAuto.setImageResource(R.drawable.auto)

        binding.btFinalizar.setOnClickListener {
            val myIntent = Intent(this, PasajeroViajes_puntoO::class.java)
            startActivity(myIntent)
        }

    }
}