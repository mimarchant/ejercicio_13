package com.example.individual_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main() {
    val result = suma(1.3213, 2.8768F)
    println(result)

    redondeo(3.14)

    muestraResultado(5.75)
}

fun  suma(num1: Double, num2: Float) : Double {
    return num1 + num2
}

fun redondeo(num: Double) {
    println(Math.ceil(num))
}

fun muestraResultado(num: Double) {
    val formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US)
    val resultado = formatoMoneda.format(num)
    println("El resultado es: $resultado")
}