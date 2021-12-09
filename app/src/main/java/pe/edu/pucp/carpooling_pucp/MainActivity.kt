package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.Window

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btLogin.setOnClickListener {
            if (binding.txtUsername.text.toString() =="Chofer"){
                val myIntent = Intent(this, ChoferViajes_Inicio::class.java)
                startActivity(myIntent)
            }else{
                val myIntent = Intent(this, PasajeroViajes_distritos::class.java)
                startActivity(myIntent)
            }
        }
    }
}