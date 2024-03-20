
fun main(args: Array<String>) {
    println("hola mundo esta app funciona")

    //genera un arreglo de cosas e iteralo para imprimir cada cosa
    var cosas = arrayOf("cosa1", "cosa2", "cosa3")
    var  cosa1 : String = "mundo"
    
    //agrega a cosas elementos
    cosas += "cosa4"
    cosas += "cosa5"
    cosas += cosa1
    for (cosa in cosas) {
        println(cosa)
    }

    val number = 32.minus(30)
    
    print(number + cosas.size)

    var comidas = ArrayList<String>()

    comidas.add("pizza")
    comidas.add("peperoni")
    comidas.add("barbacoa")

    var piza = "peperomi"
   //recorrer con forEach
    comidas.forEach { comida ->
        println(  "la comida es $comida")
    }

    //crear clase comida
    class Comida(val nombre: String, val tipo: String) {
        fun describir() {
            println("La comida $nombre es de tipo $tipo")
        }
    }


    //crear instancia de comdia
    
    val spaguetti = Comida("spagueti", "pasta")

    spaguetti.describir()
}




