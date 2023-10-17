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
    val Bochito = Vehiculo ("Volkwagen", "67", "Blanco", "AF7845")
    println("el carro es de la marca: ${Bochito.marca} " )

    val Per = Persona ("Eduardo", "Ruiz Anaya", "Masculino", 1.63f)
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
    val enemy = Goomba ()

    val koopa = Koopa()
    koopa.collision("Weapon")

}