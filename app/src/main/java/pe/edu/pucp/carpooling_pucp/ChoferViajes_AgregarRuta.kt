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

        val idFrame:Int = binding.fragmentContainerView20.id
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = upperMenu()

        val mBundle = Bundle()
        mBundle.putBoolean("my_boolean",true)
        mFragment.arguments = mBundle
        mFragmentTransaction.add(idFrame, mFragment).commit()

        binding.btAgregarRuta2.setOnClickListener{
            //TODO deberia agregar la ruta ala lista para asi mostrarlo
            val myIntent = Intent(this, ChoferViajes_registrarRuta::class.java)
            startActivity(myIntent)
        }

    }
}