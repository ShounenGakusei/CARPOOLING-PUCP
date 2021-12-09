package pe.edu.pucp.carpooling_pucp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toolbar
import pe.edu.pucp.carpooling_pucp.databinding.ActivityMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class upperMenu : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view: View = inflater!!.inflate(R.layout.fragment_upper_menu, container, false)

        var imgage:ImageView = view.findViewById(R.id.img_logout)
        imgage.setOnClickListener {
                view ->
            val myIntent = Intent(context, MainActivity::class.java)
            startActivity(myIntent)
        }


        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            upperMenu().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}