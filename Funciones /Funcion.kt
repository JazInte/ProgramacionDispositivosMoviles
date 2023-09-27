fun login (user: String, password: String): Boolean{
    fun validate (input: String): Boolean {
        if (input.isEmpty()) {
            return false
        }
        return true
    }
    val userValidated = validate (user)
    val passValidated = validate (password)

    return userValidated && passValidated
}

val userValidated = login ("Eduardo" , "2468")
println ("Usuario Loggeado? $userValidated")

fun rectangleArea (base:Double =20.0, height: Double = 30.0):Double{
    return base*height


}

fun main(){
    println("Area con base por defecto: ${rectangleArea(height = 10.0)}")
    println("Area con datos determinados con named arguments:${rectangleArea (height = 2.0, base = 3.5)}")
}


fun main() {
    val userValidated = login("Jose", "admin")
    println("Usuario logeado?  $userValidated ")
    
    println("Area con valores por defecto: ${rectangleArea(height = 20.0)}")
    
    println("volumen ${volumen(20.0, 20.0, 20.0)}")
    
    println("promedio ${promedio(cal3 = 10f)}")
    
    val promedios = promedio(cal3 = 10f)
    
    println("El promedio del alumno es $promedios")
    gradoEscolar()
    triangle(10f,15f,17f)}

}

fun login(user: String, password: String): Boolean{
    fun validate(input: String): Boolean{
        if (input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}

fun rectangleArea(base : Double= 20.0, height: Double = 30.0): Double{
    return base*height
}
fun volumen(ancho : Double, base: Double, height : Double): Double{
    return rectangleArea(base, height)*ancho
}
fun promedio(cal1 : Float = 8f, cal2 : Float = 8f, cal3 : Float): Float{
    return (cal1+cal2+cal3)/3
}


fun gradoEscolar(){
    val x = 15
    when(x){
        1 -> println("uno")
        2 ->println("dos")
        in 2..5 ->println("dos a cinco")
        in 6..11 ->println("seis a once")
        else ->{
            println("no esta en el rango")
        }
    }
}

fun triangle(lado1 : Float, lado2 : Float, lado3: Float) {
    if(lado1.equals(lado2) && lado2.equals(lado3)){
        println("Equilatero")
    }else if(lado1.equals(lado2) || lado2.equals(lado3) || lado3.equals(lado1)){
        println("Isoceles")
    }else{
        println("Escaleno")
    }
}

fun tipoDeDato(dato: Any ){
    
    when(dato){
        is String -> println("String")
        is Int ->println("Entero")
        is Double ->println("Doble")
        else ->{
            println("no esta soportado")
        }
    }
}