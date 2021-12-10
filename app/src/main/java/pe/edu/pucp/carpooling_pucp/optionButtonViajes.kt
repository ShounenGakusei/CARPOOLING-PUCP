package pe.edu.pucp.carpooling_pucp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class optionButtonViajes : Fragment() {
    var haciaPUCP: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_option_button_viajes, container, false)

        val bundle = arguments
        val message = bundle?.getBoolean("MY_BOOLEAN")

        var buttonHacia : Button = view.findViewById(R.id.bt_haciaPUCP)
        var buttonDesde : Button = view.findViewById(R.id.bt_desdePUCP)

        if ((message == false) or (message==null)){
            this.haciaPUCP = true
            buttonHacia.setBackgroundResource(R.drawable.option_viajes_button)
            buttonDesde.setBackgroundResource(R.color.white)

        }else{
            this.haciaPUCP = false
            buttonHacia.setBackgroundResource(R.color.white)
            buttonDesde.setBackgroundResource(R.drawable.option_viajes_button)
        }

        buttonHacia.setOnClickListener {
            if (haciaPUCP==false) {
                buttonHacia.setBackgroundResource(R.drawable.option_viajes_button)
                buttonDesde.setBackgroundResource(R.color.white)
                haciaPUCP=true
            }
        }

        buttonDesde.setOnClickListener {
            if (haciaPUCP==true) {
                buttonHacia.setBackgroundResource(R.color.white)
                buttonDesde.setBackgroundResource(R.drawable.option_viajes_button)
                haciaPUCP=false
            }
        }


        return view
    }





}