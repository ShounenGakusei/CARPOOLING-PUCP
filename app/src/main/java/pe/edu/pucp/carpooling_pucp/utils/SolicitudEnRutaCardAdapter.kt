package pe.edu.pucp.carpooling_pucp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import pe.edu.pucp.carpooling_pucp.R
import pe.edu.pucp.carpooling_pucp.models.ChoferModel
import pe.edu.pucp.carpooling_pucp.models.RutasModel

class SolicitudEnRutaCardAdapter   (var items: ArrayList<ChoferModel>, val itemClickHandler: (Int) -> Unit): RecyclerView.Adapter<SolicitudViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolicitudViewHolder{

        val headerView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_pasajeros_solicitudes, parent, false)
        lateinit var solicitudViewHolder: SolicitudViewHolder

        solicitudViewHolder = SolicitudViewHolder(headerView)
        headerView.setOnClickListener {
            itemClickHandler.invoke(solicitudViewHolder.adapterPosition)
        }
        return solicitudViewHolder
    }


    override fun onBindViewHolder(holder: SolicitudViewHolder, position: Int) {
        if (items.get(position).estado == 2){
            return
        }
        holder.estrellas.text = items.get(position).rating.toString()
        holder.nombre.text = items.get(position).nombre.toString()
        holder.rutaOrigen.text = items.get(position).descripcion.toString()


        holder.imgEstrellas.setImageResource(R.drawable.ic_baseline_star_24)
        holder.imgDecline.setImageResource(R.drawable.ic_baseline_remove_circle_24)
        holder.imgCheck.setImageResource(R.drawable.ic_baseline_check_circle_24)
        holder.imgComent.setImageResource(R.drawable.ic_baseline_comment_24)

        holder.imgFoto.setImageResource(R.drawable.logo)

        if (items.get(position).estado==1){
            holder.imgDecline.isVisible = false
            holder.imgCheck.isVisible = false
        }

        holder.imgCheck.setOnClickListener {
            items.get(position).estado = 1
        }

        holder.imgDecline.setOnClickListener {
            items.get(position).estado = 2
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class SolicitudViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var estrellas: TextView = itemView.findViewById(R.id.txt_estrellas)
    var nombre: TextView = itemView.findViewById(R.id.txt_nomb)
    var rutaOrigen: TextView = itemView.findViewById(R.id.txt_origen)

    var imgComent: ImageView = itemView.findViewById(R.id.img_comment)
    var imgCheck: ImageView = itemView.findViewById(R.id.img_check)
    var imgDecline: ImageView = itemView.findViewById(R.id.img_decline)
    var imgEstrellas: ImageView = itemView.findViewById(R.id.img_estrrellas)

    var imgFoto:ImageView = itemView.findViewById(R.id.img_Pasajero)

}