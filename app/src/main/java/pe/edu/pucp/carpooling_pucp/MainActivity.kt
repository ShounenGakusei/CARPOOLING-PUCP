package pe.edu.pucp.carpooling_pucp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        //Thread policy for internet access
        val SDK_INT = android.os.Build.VERSION.SDK_INT
        if (SDK_INT > 8) {
            val policy = StrictMode.ThreadPolicy.Builder()
                .permitAll().build()
            StrictMode.setThreadPolicy(policy)
        }


        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




         binding.btLogin.setOnClickListener {
        /*
          //val connection = URL("http://10.0.2.2:8000/clientes/").openConnection() as HttpURLConnection
          val connection = URL("http://10.0.2.2:8000/clientes/").readText()
          Log.d("Conection",connection)
          */
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