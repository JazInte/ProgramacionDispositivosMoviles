package clases

fun main(args: Array<String>) {
    println("Hello World!")

    val myphone = Phone()
    myphone.getTurn()
    myphone.turnOn()
    myphone.getTurn()

    /*val vehiculo = Vehiculo()
    vehiculo.color = "Verde"
    vehiculo.marca = "Ford"
    vehiculo.modelo = "Focus"
    vehiculo.placas = "RSDFSDA"

    println("el carro esta: ${vehiculo.encendido} " )
    vehiculo.encender()
    println("El carro esta encendido: ${vehiculo.encendido}")
    println("el carro tiene gasolina: ${vehiculo.gasolina} " )
    vehiculo.recargar(20.07f)
    println("El carro tiene gasolina: ${vehiculo.gasolina}")
        */
    val Bochito = Vehiculo("Volkwagen", "67", "Blanco", "AF7845")
    println("el carro es de la marca: ${Bochito.marca} ")
    val Per = Persona("Eduardo", "Ruiz Anaya", "Masculino", 1.63f)
    /*
            var mario = Mario()

            mario.collision("Goomba")

            for(i in 1..6){
                mario.collision("Goomba")
                println("te quedan ${mario.vidas}")
            }

            for(i in 1..5){
                mario.collision("Goomba")
                //println("te quedan ${mario.vidas}")
            }
        */
    val enemy = Goomba()

    val koopa = Koopa()
    koopa.collision("Weapon")
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(5)
    viajeMonterrey.reserve(5)

    val viajaMonterey = NationalLowSeason("Monterrey")
    viajaMonterey.reserve(4)

    val scaryMovie = Movie("Scary movie", "Comedia", 88.27)

    println(scaryMovie)
    scaryMovie.createdAt = "2000"
    println("La fecha de creacion es ${scaryMovie.createdAt}")
    println(scaryMovie.component1())

    val (name, gender, duration) = scaryMovie
    println("La duracion de la pelicula es $duration minutos, name $name, genero: $gender")
    val scaryMovie2 = scaryMovie.copy("Scary movie 2", "Comedia", 83.0)
    println(
        """
        Scary Movie: $scaryMovie
        Scary movie 2: $scaryMovie2
    """.trimIndent()
    )


    val saverGrade: (Double, Double) -> String = { expected: Double, saved: Double ->
        val percentaje = saved / expected
        when {
            percentaje > 1 -> "Ahorrador pro"
            percentaje == 1.0 -> "Buen ahorrador"
            percentaje < 1.0 && percentaje >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }

    val saverGrade2 = fun(expected: Double, saved: Double) : String {
        val percentage = saved / expected

        return when{
            percentage > 1 -> "Ahorrador pro"
            percentage == 1.0 -> "buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }

    println(saverGrade(12.0, 13.0))
    println(saverGrade2(18.0, 19.0))

    fun calculadora (a: Int, b: Int, operacion :(Int, Int) -> Int): Int {
        return operacion (a,b)
    }
    fun suma(a:Int, b:Int) = a+b
    fun resta(a:Int, b:Int) = a-b
    fun multiplicar(a:Int, b:Int) = a*b
    fun dividir(a:Int, b:Int) = a/b
    println(calculadora(5,4, ::suma))
    println(calculadora(5,4, ::resta))
    println(calculadora(5,4, ::multiplicar))
    println(calculadora(5,4, ::dividir))

}