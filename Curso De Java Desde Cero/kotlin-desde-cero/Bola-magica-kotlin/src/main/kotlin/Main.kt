const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "🤭"

var respuestas = mutableMapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)





fun main(args: Array<String>) {

   val respuesta = optionMenu()



}



fun realizarPregunta() {
    println("Cual es tu pregunta?")
    val respuestaUsuario = readln()
    println(respuestas.keys.random())
    salir()
}


fun salir() {
    println("Gracias por haber utilizado la aplicacion.")
}

fun respuestaInvalida() {
    println("Lo siento la respuesta ingresada es Invalida")
    optionMenu()
}

fun optionMenu(){
    println("1. Realizar una pregunta")
    println("2. Ver las Respuestas")
    println("3. Salir")

    val respuesta = readln().toInt()

    when(respuesta){
        1 -> realizarPregunta()
        2 -> visualizarRespuestas("nada")
        3 -> salir()
        else -> respuestaInvalida()
    }
}


//VISUALIZAR RESPUESTAS
fun visualizarRespuestas(error: String) {
    if(error == "error"){
        println("Respuesta Incorrecta!")
    }
    println("1. Ver todas las respuestas")
    println("2. Ver solo las respuestas positivas")
    println("3. Ver solo las respuestas dudosas ")
    println("4. Ver solo las respuestas negativas ")
    println("5. Volver al menu de opciones  ")
    val respuesta = readln().toInt()

    when(respuesta){
        1 -> visualizarRespuestasFiltradas()
        2 -> visualizarRespuestasFiltradas(RESPUESTA_AFIRMATIVA)
        3 -> visualizarRespuestasFiltradas(RESPUESTA_DUDOSA)
        4 -> visualizarRespuestasFiltradas(RESPUESTA_NEGATIVA)
        5 -> optionMenu()
        else ->visualizarRespuestas("error")
    }

}

fun visualizarRespuestasFiltradas(filtro:String = "TODOS") {
    println("::-- LAS RESPUESTAS SON: --::")
    when(filtro){
        "TODOS"-> respuestas.forEach{respuesta -> println(respuesta)}
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { respuesta -> respuesta == RESPUESTA_AFIRMATIVA }.also {
            respuestasPositivas -> respuestasPositivas.keys.forEach { respuesta -> println(respuesta) }
        }
        RESPUESTA_DUDOSA -> respuestas.filterValues { respuesta -> respuesta == RESPUESTA_DUDOSA }.also {
                respuestasDudosas -> respuestasDudosas.keys.forEach { respuesta -> println(respuesta) }
        }
        RESPUESTA_NEGATIVA -> respuestas.filterValues { respuesta -> respuesta == RESPUESTA_NEGATIVA }.also {
                respuestasNegativas -> respuestasNegativas.keys.forEach { respuesta -> println(respuesta) }
        }
    }
    println("::====:::====:::====::")
    visualizarRespuestas("")

}

