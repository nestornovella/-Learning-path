


fun main(args: Array<String>) {
    println(randomCase(frase = "", unaMas ="")) 
}

fun randomCase(frase: String, otra:String = "", unaMas:String): String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()

    return if(resultadoAleatorio.rem(2)== 0){
        frase.uppercase() 
    }else{
        frase.lowercase()
    }
         
}