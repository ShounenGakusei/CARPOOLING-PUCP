package pe.edu.pucp.carpooling_pucp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.R
import pe.edu.pucp.carpooling_pucp.models.RutasModel

class RutasCreadasCardAdapder (var items: ArrayList<RutasModel>, val itemClickHandler: (Int) -> Unit): RecyclerView.Adapter<RutaCreadasViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RutaCreadasViewHolder {
        val headerView = LayoutInflater.from(parent.context).inflate(R.layout.card_seleccionar_rutas,parent,false)
        lateinit var rutaViewHolder: RutaCreadasViewHolder

        rutaViewHolder = RutaCreadasViewHolder(headerView)
        headerView.setOnClickListener {
            itemClickHandler.invoke(rutaViewHolder.adapterPosition)
        }
        return rutaViewHolder
    }

    override fun onBindViewHolder(holder: RutaCreadasViewHolder, position: Int) {
        holder.nombre.text = items.get(position).rutaNombre.toString()
        holder.descripcion.text = items.get(position).rutaDescripcion.toString()
        holder.distrito.text = items.get(position).rutaDistrito.toString()


        holder.imgAdd.setImageResource(R.drawable.ic_baseline_add_24)

    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class RutaCreadasViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    var nombre: TextView = itemView.findViewById(R.id.txt_rutaNum)
    var descripcion: TextView = itemView.findViewById(R.id.txt_descrpRuta)
    var distrito: TextView = itemView.findViewById(R.id.txt_distritoRut)
    var imgAdd: ImageView = itemView.findViewById(R.id.img_addRuta)

}