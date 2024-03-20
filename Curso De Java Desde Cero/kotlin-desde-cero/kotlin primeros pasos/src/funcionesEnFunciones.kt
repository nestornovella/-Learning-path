

import cuantosCaracteres
fun main(args: Array<String>) {
  
  println(cuantosCaracteres("Hola Mundo!", {msj -> msj.length})) 

  var funciones = superFunction(300)
  println(funciones())
}


//crea funcion que ejecute callback

fun cuantosCaracteres (message: String, cb: (String)-> Int):Int{

  return cb(message) 
}



//crea una funcion que retorne una funcion

fun superFunction (numero: Int):()-> Int{
  return { -> numero * 1000}
}