package com.example.app01_pm

class Vehiculo (val traccion: Array<Traccion>, val motor: String, val tipo: Array<Tipo>, val capacidad: Int) {
    enum class Traccion {
        AWD,
        FWD,
        RWD,
    }

    enum class Tipo {
        Ligero,
        Furgón,
        Autobus,
        Motocicleta
    }

    fun vehiculo(){
        var propiedades = ""
        for (i in traccion) {
            propiedades += "Tracción = " + i + "\n"
        }
        propiedades += "Motor = " + motor + "\n"
        for (i in tipo) {
            propiedades += "Tipo = " + i + "\n"
        }
        propiedades += "Capacidad = " + capacidad + "\n"
        println(propiedades)
    }
}