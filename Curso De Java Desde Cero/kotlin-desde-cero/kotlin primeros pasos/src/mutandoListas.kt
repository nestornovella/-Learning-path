

fun main(args: Array<String>) {
    val listaDeNombres = mutableListOf<String>("juan", "enrrique")

    listaDeNombres.add("Cristian")
    listaDeNombres.remove("juan")
    println(listaDeNombres)

    println(listaDeNombres.sortedBy { name:String -> name[0].toString() == "e"  })
    println(listaDeNombres.shuffled())//parametros random
    println(listaDeNombres.shuffled())//parametros random
    println(listaDeNombres.shuffled())//parametros random
    println(listaDeNombres.reversed())
}