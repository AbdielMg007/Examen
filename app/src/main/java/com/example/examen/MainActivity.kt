package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buscar(view: View?) {

        val buscador = findViewById<EditText>(R.id.buscador).text
        val valor: Int
        val tipoError: String 

        if (buscador.isNotEmpty()) {
            if (buscador.toString().toInt() < 7) {
                val precios = productos(buscador.toString().toInt())
                valor = precios()
                showMensaje(valor)
            } else {
                tipoError = "Su producto no edsta en la lista"
                showAlert(tipoError)
            }
        } else{
            tipoError = "Porfavor, llene todos los campos"
            showAlert(tipoError)
        }

    }
    private fun showAlert(error: String){
        val men = AlertDialog.Builder(this)
        men.setTitle("Error")
        men.setMessage(error)
        men.setPositiveButton("Aceptar", null)
        val dial: AlertDialog = men.create()
        dial.show()
    }

    private fun showMensaje(precio: Int){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Su producto vale:")
        builder.setMessage(precio.toString())
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}