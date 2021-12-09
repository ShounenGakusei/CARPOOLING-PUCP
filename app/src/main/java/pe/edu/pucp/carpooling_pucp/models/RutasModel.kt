package pe.edu.pucp.carpooling_pucp.models

import java.util.*

class RutasModel {
    var chofer:ChoferModel? = ChoferModel("Juan Pepe", "Me gusta lso autos deportivos",
    1,5,null,null,null,"RD-854","Toyota","Blanco" )
    var rutaNombre:String?= "Ruta 32"
    var rutaDescripcion:String?= "Recorro todo la Av Uni"
    var hora: Date?= getCurrentDateTime()
    var asientosDisp:Int? = 0
    var asientosTotal:Int? = 5
    var rutaDistrito:String? = "San Juan de Lurigancho"

    var pasajerosAceptados:List<String>? = listOf("Maria","Lucas","Simon")
    var pasajerosSolicitud:List<String>? = listOf("Timon")

    constructor(
        chofer: ChoferModel?,
        rutaNombre: String?,
        rutaDescripcion: String?,
        hora: Date?,
        asientosDisp: Int?,
        asientosTotal: Int?,
        rutaDistrito: String?,
        pasajerosAceptados: List<String>?,
        pasajerosSolicitud: List<String>?
    ) {
        this.chofer = chofer
        this.rutaNombre = rutaNombre
        this.rutaDescripcion = rutaDescripcion
        this.hora = hora
        this.asientosDisp = asientosDisp
        this.asientosTotal = asientosTotal
        this.rutaDistrito = rutaDistrito
        this.pasajerosAceptados = pasajerosAceptados
        this.pasajerosSolicitud = pasajerosSolicitud
    }
}

