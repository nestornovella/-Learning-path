

fun main(args: Array<String>) {
    var nombre: String? = null

    try {
        println(nombre!!.length)
    }
    catch(Exception : NullPointerException) {
        println("error: " +  "el parametro no debe ser null" + Exception)

    }
}