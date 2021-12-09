package pe.edu.pucp.carpooling_pucp.models

import java.util.*

class ChoferModel {
    var nombre:String?= "Juan Pepe"
    var descripcion:String?= "RUta 32 pucp"
    var photoName: Int? = 0
    var asientosDisp:Int? = 0

    var rating:Float?= 0.toFloat()
    var hora: Date?= getCurrentDateTime()
    var precioRef:Double? = 0.0

    var vehiculoPlaca:String?="FBS-G27"
    var vehiculoModelo:String?="Toyota"
    var vehiculoColor:String?="Blanco"

    //1 = Aceptado
    //2 = Pendiente
    //3 = Cancelado
    var estado:Int? = 1

    constructor(
        nombre: String?,
        descripcion: String?,
        photoName: Int?,
        asientosDisp: Int?,
        rating: Float?,
        hora: Date?,
        precioRef: Double?,
        vehiculoPlaca: String?,
        vehiculoModelo: String?,
        vehiculoColor: String?
    ) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.photoName = photoName
        this.asientosDisp = asientosDisp
        this.rating = rating
        this.hora = hora
        this.precioRef = precioRef
        this.vehiculoPlaca = vehiculoPlaca
        this.vehiculoModelo = vehiculoModelo
        this.vehiculoColor = vehiculoColor

    }

    constructor(
        nombre: String?,
        descripcion: String?,
        photoName: Int?,
        asientosDisp: Int?,
        rating: Float?,
        hora: Date?,
        precioRef: Double?
    ) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.photoName = photoName
        this.asientosDisp = asientosDisp
        this.rating = rating
        this.hora = hora
        this.precioRef = precioRef
    }

    constructor(
        nombre: String?,
        descripcion: String?,
        photoName: Int?,
        rating: Float?,
        estado: Int?
    ) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.photoName = photoName
        this.rating = rating
        this.estado = estado
    }


}

fun getCurrentDateTime(): Date {
    return Calendar.getInstance().time
}