package pe.edu.pucp.carpooling_pucp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import pe.edu.pucp.carpooling_pucp.R
import pe.edu.pucp.carpooling_pucp.models.RutasModel

class RutasSimpleCardAdapter  (var items: ArrayList<RutasModel>, val itemClickHandler: (Int) -> Unit): RecyclerView.Adapter<RutaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RutaViewHolder {
        val headerView = LayoutInflater.from(parent.context).inflate(R.layout.card_viajes_ruta_chofer,parent,false)
        lateinit var rutaViewHolder: RutaViewHolder

        rutaViewHolder = RutaViewHolder(headerView)
        headerView.setOnClickListener {
            itemClickHandler.invoke(rutaViewHolder.adapterPosition)
        }
        return rutaViewHolder
    }

    override fun onBindViewHolder(holder: RutaViewHolder, position: Int) {
        holder.hora.text = items.get(position).hora.toString()
        holder.descripcion.text = items.get(position).rutaDescripcion.toString()
        holder.cantAsientosUsados.text = items.get(position).pasajerosAceptados?.size.toString()+" Pasajeros"
        holder.cantSolicitudes.text = items.get(position).pasajerosSolicitud?.size.toString()
        holder.distrito.text = items.get(position).rutaDistrito

        holder.imgGrupo.setImageResource(R.drawable.ic_baseline_group_24)

    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class RutaViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

    var hora: TextView = itemView.findViewById(R.id.txt_descpHeader)
    var descripcion: TextView = itemView.findViewById(R.id.txt_descripcionRuta)
    var cantAsientosUsados: TextView = itemView.findViewById(R.id.txt_cantPasajerosChofer)
    var imgGrupo: ImageView = itemView.findViewById(R.id.img_grupoPersonas)
    var cantSolicitudes:TextView = itemView.findViewById(R.id.txt_cantPasajeros)
    var distrito:TextView = itemView.findViewById(R.id.txt_distritoChofer)


}