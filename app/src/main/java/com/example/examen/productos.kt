package com.example.examen

class productos(var objeto: Int) {

    operator fun invoke(): Int {
        var objeto= objeto
        var precio: Int

        precio = stock(objeto)
        return precio
    }

    fun stock(objeto: Int):Int{

        var objetodvd = objeto-1
        var objetoaenviar: Int = 0
        var mitad: Int = 7/2

        var palabra = Array(2) { arrayOfNulls<String>(7) }
        palabra[0][0] = "1"
        palabra[1][0] = "1250"
        palabra[0][1] = "2"
        palabra[1][1] = "1420"
        palabra[0][2] = "3"
        palabra[1][2] = "1799"
        palabra[0][3] = "4"
        palabra[1][3] = "1000"
        palabra[0][4] = "5"
        palabra[1][4] = "2530"
        palabra[0][5] = "6"
        palabra[1][5] = "1800"
        palabra[0][6] = "7"
        palabra[1][6] = "1500"

        if(objeto >= mitad){
            for(mitad in 3..6){
                if(objeto == palabra[mitad][0].toString().toInt()){
                    objetoaenviar = palabra[objeto][1].toString().toInt()
                }
            }
        }else{
            for(mitad in 3 downTo 0 ){
                if(objeto == palabra[mitad][0].toString().toInt()){
                    objetoaenviar = palabra[objeto][1].toString().toInt()
                }
            }
        }

        return objetoaenviar
    }

}