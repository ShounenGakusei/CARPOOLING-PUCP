package pe.edu.pucp.carpooling_pucp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [listaHeader.newInstance] factory method to
 * create an instance of this fragment.
 */

private const val MY_BOOLEAN = "my_boolean"
class listaHeader : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle = arguments
        val message = bundle?.getBoolean(MY_BOOLEAN)
        val view: View = inflater!!.inflate(R.layout.fragment_lista_header, container, false)

        var cabeza: TextView = view.findViewById(R.id.txt_descpHeader)

        if ((message == false) or (message==null)){
            cabeza.text="LISTA DE ACEPTADOS"
        }else{
            cabeza.text="LISTA DE PENDIENTES"
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista_header, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment listaHeader.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            listaHeader().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}