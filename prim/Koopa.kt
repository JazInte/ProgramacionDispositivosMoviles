class Koopa: Enemy("koopa", 2) {

    override fun collision(collider : String){
        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("el estado es ahora $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}