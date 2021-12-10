package pe.edu.pucp.carpooling_pucp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.widget.Toast
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
             var usuario = binding.txtUsername.text.toString()
             var password = binding.txtPassword.text.toString()
            if (usuario==""){
                usuario="Hola"
            }
            var urlTemp = "http://10.0.2.2:8000/choferes/user/" + "$usuario" + '/'
            Log.d("url",urlTemp)
             val connection = URL(urlTemp).readText()
            var tempPass = '"' + password + '"'
             if ( tempPass == connection.toString()){
                 val myIntent = Intent(this, PasajeroViajes_distritos::class.java)
                 startActivity(myIntent)
             }else{
                 Toast.makeText(applicationContext,"La contraseña es incorrecta, pruebe con Juan y 123456",Toast.LENGTH_LONG).show()

                 Log.d("Conection", connection +"ad")
                 //val myIntent = Intent(this, ChoferViajes_Inicio::class.java)
             //startActivity(myIntent)
             }
        }

         }
    }
