package pe.edu.pucp.carpooling_pucp.models

class Cliente {
    var ruc:String? = "987654321"
    var nombre:String? = "Juan Perez"
    var borrado:Boolean? = true


    constructor(ruc: String?, nombre: String?, borrado: Boolean?) {
        this.ruc = ruc
        this.nombre = nombre
        this.borrado = borrado
    }

}