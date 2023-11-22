open class Enemy(val name: String, val strength : Int) {
    protected var direction : String = "LEFT"

    protected fun changeDirection(){
        direction = if (direction == "RIGHT") "LEFT" else "RIGTH"
        println("$name va en direccion $direction")
    }

    protected fun die(){
        println("$name ha muerto")
    }
    open fun collision(collider: String){
        when(collider) {
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}