package com.example.app01_pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// TALLER - Utilizando clases, funciones y lo aprendido en clases realizar el siguiente algoritmo:
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("1. Validar si una persona es mayor o  menor de edad")
        val edad = 18
        if (edad < 18) {
            println("La persona es menor de edad.")
        } else {
            println("La persona es mayor de edad.")
        }

        println("2. Presentar la tabla de multiplicar de n número de forma ascendente y descendente")
        val num = 2
        println("Multiplicación - ASCENDENTE")
        for (i in 0..15) {
            println("$num x $i = " + (num*i))
        }
        println("Multiplicación - DESCENDENTE")
        for (i in 15 downTo 0) {
            println("$num x $i = " + (num*i))
        }

        println("3. Mostrar el listado de paralelo de la materia de Plataformas móviles y los subgrupos por proyectos (Mostrar los resultados ordenados)")
        val estudiantes = listOf<String>("Shomira Rosales", "Joan Briceño", "Jordy Esparza",
            "Luis Quizhpe", "Andres Vallejo", "Edgar Guamo", "Erick Jaramillo", "Brandon Vega",
            "Ian Ortega", "David Pillco", "Ricardo Freire", "Jeferson Cueva", "Frank Saca", "David" +
                    " Salazar", "Israel Tapia", "Santiago Garcia", "Daniel Medina")
        var proyectoTurismo = listOf<String>()
        var proyectoBanca = listOf<String>()

        for (i in estudiantes.indices) {
            if (i % 2 == 0) {
                proyectoTurismo += estudiantes[i]
            } else {
                proyectoBanca += estudiantes[i]
            }
        }
        println ("Estudiantes del paralelo -> ${estudiantes.sorted()}\nSubgrupo de Turismo -> " +
                "${proyectoTurismo.sorted()}\nSubgrupo de Banca y Finanzas -> ${proyectoBanca.sorted()}")

        println("4. Presentar las propiedades de un vehículo utilizando clases, como tracción, motor, tipo de vehículo, capacidad")
        // Ingreso de propiedades
        val vehiculoA = Vehiculo(arrayOf(Vehiculo.Traccion.AWD), motor = "4 tiempos", arrayOf(Vehiculo.Tipo.Autobus), capacidad = 30)
        val vehiculoB = Vehiculo(arrayOf(Vehiculo.Traccion.FWD), motor = "Diesel", arrayOf(Vehiculo.Tipo.Furgón), capacidad = 8)
        val vehiculoC = Vehiculo(arrayOf(Vehiculo.Traccion.RWD), motor = "2 tiempos", arrayOf(Vehiculo.Tipo.Ligero), capacidad = 5)
        val vehiculoD = Vehiculo(arrayOf(Vehiculo.Traccion.AWD), motor = "Boxer Diesel", arrayOf(Vehiculo.Tipo.Motocicleta), capacidad = 2)
        // Presentación de propiedades
        println("VEHICULO A\n")
        vehiculoA.vehiculo()
        println("VEHICULO B\n")
        vehiculoB.vehiculo()
        println("VEHICULO C\n")
        vehiculoC.vehiculo()
        println("VEHICULO D\n")
        vehiculoD.vehiculo()

        println("5. Algoritmo para ordenar un array")
        var arrayNumeros = arrayListOf<Int>(1,3,2,5,9,4,7,6,8)
        // println("$arrayNumeros")
        var aux3 = 0
        // MÉTODO BURBUJA - ASCENDENTEMENTE
        for(i in (0 until arrayNumeros.size - 1)){
            for (j in (0 until arrayNumeros.size - i - 1)){
                if (arrayNumeros[j + 1] < arrayNumeros[j]){
                    aux3 = arrayNumeros[j + 1]
                    arrayNumeros[j + 1] = arrayNumeros[j]
                    arrayNumeros[j] = aux3
                }
            }
        }
        // LISTA ORDENADA
        println("$arrayNumeros")

        println("6. Validar un número de cédula")
        val cedula = "1104662232"
        val multiplicador = listOf(2, 1, 2, 1, 2, 1, 2, 1, 2)
        var aux = listOf<Int>()
        var suma = 0
        for (i in cedula.indices){
            aux += Character.getNumericValue(cedula[i])
        }
        // OPERACION DE MULTIPLICACION
        var multiplicacion = 1
        for (i in multiplicador.indices) {
            multiplicacion = aux[i] * multiplicador[i]
            if (multiplicacion < 10){
                suma += multiplicacion
            } else {
                var aux2 = multiplicacion.toString()
                suma += (Character.getNumericValue(aux2[0]) + Character.getNumericValue(aux2[1]))
            }
        }
        var resultado = 0
        when (suma){
            in 0..10 -> resultado = 10 - suma
            in 11..20 -> resultado = 20 - suma
            in 21..30 -> resultado = 30 - suma
            in 31..40 -> resultado = 40 - suma
            in 41..50 -> resultado = 50 - suma
            in 51..60 -> resultado = 60 - suma
            in 61..70 -> resultado = 70 - suma
            in 71..80 -> resultado = 80 - suma
            in 81..90 -> resultado = 90 - suma
            in 91..100 -> resultado = 100 - suma
            in 101..110 -> resultado = 110 - suma
            in 111..120 -> resultado = 120 - suma
            in 121..130 -> resultado = 130 - suma
        }
        // COMPROBACION
        if (resultado == aux[9]){
            println("La cédula " + cedula + " es válida.")
        } else {
            println("La cédula " + cedula + " es inválida.")
        }

    }
}