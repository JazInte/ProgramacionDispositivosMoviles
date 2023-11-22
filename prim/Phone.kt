class Phone {
    var isON = false

    fun turnOn(){
        isON = true
    }

    fun getTurn(){
        val turnmode = if (isON) "encendido" else "apagado"
        println("el telefono esta $turnmode")
    }


}