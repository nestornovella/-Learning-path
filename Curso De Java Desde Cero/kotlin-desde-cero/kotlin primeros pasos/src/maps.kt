fun main(args: Array<String>) {
    var mapa = mapOf("spiderman" to 32, "ironman" to 45, "capitan america" to 105)

    var mapaMutable =
            mutableMapOf(
                    "spiderman" to "tela arana",
                    "ironman" to "traje poderoso",
                    "capitan america" to "escudo indestructible"
            )

    mapa.forEach { (e) -> println(e) }
}
