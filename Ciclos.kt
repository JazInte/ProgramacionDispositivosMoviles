fun main (){
    for (i in 1..5){
        println(i)
    }


    val nombres = listOf (
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Donkey Kong",
        "Yoshi"
    )

for (nombre in nombres){
    println(nombre)
}
println("\n")println("\n")
nombres.forEach{
    println(it)
}


}