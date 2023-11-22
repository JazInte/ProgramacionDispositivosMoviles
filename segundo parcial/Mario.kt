package clases

class Mario(var vidas : Int = 3) {
    init {
        println("its a me ! mario")
    }
    private var state = "small"
        set(value){
            field = value
        }
        get() = field


    private var lives = 3
        get(){
            return lives-1
        }
    private fun die(){
        lives--
        println("has perdido una vida")
    }
    public fun collision(collisionObj : String){
        when(collisionObj){
            "Goomba" -> die()
            "Super mushroom" -> state = "Super mario"
            "Fire flower" -> state = "Fire Mario"
            else -> println("Objeto desconocido !! no pasa nada")
        }
    }
}