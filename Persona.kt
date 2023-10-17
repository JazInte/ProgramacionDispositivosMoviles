class Persona constructor(val nombre: String, val apellidos: String, val sexo: String, val altura: Float) {
    init {
        println("""Los datos de la persona son:
            nombre: $nombre
            apellidos: $apellidos
            sexo: $sexo
            altura: $altura
        """.trimMargin())
    }
}