package pe.edu.pucp.carpooling_pucp.utils

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import pe.edu.pucp.carpooling_pucp.R
import pe.edu.pucp.carpooling_pucp.models.ChoferModel

class RutasCardAdapter (var context: Context, var arrayList: ArrayList<ChoferModel>): BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {

        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = View.inflate(context, R.layout.card_ruta_distrito, null)

        var nombre: TextView = view.findViewById(R.id.id_nombreChofer1)
        var descripcion: TextView = view.findViewById(R.id.descripRutaCard)
        var photoName: ImageView = view.findViewById(R.id.fotoChoferCard)
        var asientosDisp: TextView = view.findViewById(R.id.id_asientos_disp)
        var rating: RatingBar = view.findViewById(R.id.ratingBar_card)
        var hora: TextView = view.findViewById(R.id.id_horaChofer1)
        var precioRef: TextView = view.findViewById(R.id.precioRefCard)

        var items: ChoferModel = arrayList.get(position)
        nombre.text = items.nombre
        descripcion.text = items.descripcion
        photoName.setImageResource(items.photoName!!)
        asientosDisp.text = items.asientosDisp!!.toString() + " Asientos Disp."
        rating.rating = items.rating!!
        hora.text = items.hora!!.toString()
        precioRef.text = items.precioRef!!.toString() + " Soles"

        return view!!
    }
}