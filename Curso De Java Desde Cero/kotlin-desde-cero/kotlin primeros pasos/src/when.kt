

fun main(args: Array<String>) {
    val name = "alexander"

    var message = "hola mi nombre es: "
    when (name){
        "alexander" -> { println(message + name)}
        else -> { println("invalid Name!")}
    }


    var statusCode = 402
    when (statusCode){
        in 200..300 -> println("correct")
        in 400..500 -> println("error")

    }

}