package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesInicioBinding
import pe.edu.pucp.carpooling_pucp.databinding.ActivityChoferViajesRegistrarBinding

class ChoferViajes_Registrar : AppCompatActivity() {
    private lateinit var binding: ActivityChoferViajesRegistrarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChoferViajesRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val idFrame:Int = binding.fragmentContainerView16.id
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = upperMenu()

        val mBundle = Bundle()
        mBundle.putBoolean("my_boolean",true)
        mFragment.arguments = mBundle
        mFragmentTransaction.add(idFrame, mFragment).commit()

        binding.btRegistrarViaje.setOnClickListener{
            val myIntent = Intent(this, ChoferViajes_Inicio::class.java)
            startActivity(myIntent)
        }

        binding.imgAgregarRuta.setOnClickListener {
            //TODO Debe pedir el nombre de la ruta
            val myIntent = Intent(this, ChoferViajes_registrarRuta::class.java)
            startActivity(myIntent)
        }
    }
}