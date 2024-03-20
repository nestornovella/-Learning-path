

fun main(args: Array<String>) {
    val listaDeFrutas = arrayOf("manzanas", "peras", "sandias")


    for (fruta in listaDeFrutas) {
        println("la fruta seleccionada es ${fruta}")
    }

    listaDeFrutas.forEach { fruta ->
        println("la fruta es -> $fruta")
     }


     var nuevaListaDeFrutas = listaDeFrutas.map { fruta -> "la fruta -> $fruta tiene -> ${fruta.length} caracteres."
     
    }

    foo("-------------------------")
    nuevaListaDeFrutas.forEach{ frase -> println(frase)}
    val listaFiltrada = listaDeFrutas.filter { fruta :String -> fruta == "sandias" }

    println(listaFiltrada)
  
}

fun foo(mensaje:String) = {
    println(mensaje)
} 

