package clases

open class National(override val city: String): Travel() {
    override val country = "Mexico"

    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San cristobal de las casas" to 240,
        "San miguel de allende" to 320
    )
    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)
        if (price == 0){
            println("Lo sentimos, no hacemos vicitas a esta ciudad")
        }else{
            println("tu viaje a $city cuesta \$$price")
        }
    }

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city]
        return if(fee == null) 0 else fee* numDays
    }
}