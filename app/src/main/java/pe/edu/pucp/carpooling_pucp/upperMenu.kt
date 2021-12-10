package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import android.os.Bundle
import android.text.BoringLayout
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

private const val MY_BOOLEAN = "my_boolean"


class upperMenu() : Fragment( ) {
    var estadoUsuario:Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bundle = arguments
        val message = bundle?.getBoolean(MY_BOOLEAN)

        val view: View = inflater!!.inflate(R.layout.fragment_upper_menu, container, false)

        var imgage:ImageView = view.findViewById(R.id.img_logout)
        imgage.setOnClickListener {
                view ->
            val myIntent = Intent(context, MainActivity::class.java)
            startActivity(myIntent)
        }


        var imageUser:ImageView = view.findViewById(R.id.img_usuario)


        if ((message == false) or (message==null)){
            this.estadoUsuario = false
            imageUser.setImageResource(R.drawable.ic_baseline_person_24)
        }else{
            this.estadoUsuario = true
            imageUser.setImageResource(R.drawable.ic_baseline_directions_car_24)
        }


        imageUser.setOnClickListener {
            if (this.estadoUsuario==true){
                val myIntent = Intent(context, PasajeroViajes_distritos::class.java)
                startActivity(myIntent)
            }else{
                val myIntent = Intent(context, ChoferViajes_Inicio::class.java)
                startActivity(myIntent)
            }
        }
        Log.d("Boolean","$message")
        return view
    }

}