package pe.edu.pucp.carpooling_pucp.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.R
import pe.edu.pucp.carpooling_pucp.models.ChoferModel

public class RutasCardAdapter (var items: ArrayList<ChoferModel>, val itemClickHandler: (Int) -> Unit): RecyclerView.Adapter<RutasCardAdapter.ChoferModelHolder>(){

     /*fun temp(position: Int, convertView: View?, parent: ViewGroup?): View {
        //val view: View = View.inflate(context, R.layout.card_ruta_distrito, null)

        var nombre: TextView = view.findViewById(R.id.id_nombreChofer1)
        var descripcion: TextView = view.findViewById(R.id.descripRutaCard)
        var photoName: ImageView = view.findViewById(R.id.fotoChoferCard)
        var asientosDisp: TextView = view.findViewById(R.id.id_asientos_disp)
        var rating: RatingBar = view.findViewById(R.id.ratingBar_card)
        var hora: TextView = view.findViewById(R.id.id_horaChofer1)
        var precioRef: TextView = view.findViewById(R.id.precioRefCard)

        var items: ChoferModel = items.get(position)
        nombre.text = items.nombre
        descripcion.text = items.descripcion
        photoName.setImageResource(items.photoName!!)
        asientosDisp.text = items.asientosDisp!!.toString() + " Asientos Disp."
        rating.rating = items.rating!!
        hora.text = items.hora!!.toString()
        precioRef.text = items.precioRef!!.toString() + " Soles"

        return view!!
       }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChoferModelHolder {
        var headerView = LayoutInflater.from(parent.context).inflate(R.layout.card_ruta_distrito,parent,false)
        lateinit var choferViewHolder: ChoferModelHolder
        choferViewHolder = ChoferModelHolder(headerView)
        headerView.setOnClickListener {
            itemClickHandler.invoke(choferViewHolder.adapterPosition)
        }
        return choferViewHolder
    }

    override fun onBindViewHolder(holder: ChoferModelHolder, position: Int) {
        holder.nombre.text = items.get(position).nombre
        holder.descripcion.text = items.get(position).descripcion
        holder.photoName.setImageResource(items.get(position).photoName!!)
        holder.asientosDisp.text = items.get(position).asientosDisp!!.toString() + " Asientos Disp."
        holder.rating.rating = items.get(position).rating!!
        holder.hora.text = items.get(position).hora!!.toString()
        holder.precioRef.text = items.get(position).precioRef!!.toString() + " Soles"

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ChoferModelHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var nombre: TextView = itemView.findViewById(R.id.id_nombreChofer1)
        var descripcion: TextView = itemView.findViewById(R.id.descripRutaCard)
        var photoName: ImageView = itemView.findViewById(R.id.fotoChoferCard)
        var asientosDisp: TextView = itemView.findViewById(R.id.id_asientos_disp)
        var rating: RatingBar = itemView.findViewById(R.id.ratingBar_card)
        var hora: TextView = itemView.findViewById(R.id.id_horaChofer1)
        var precioRef: TextView = itemView.findViewById(R.id.precioRefCard)
    }
}