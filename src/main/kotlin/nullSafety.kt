import java.lang.NullPointerException

fun nullSafety(name: String? = null){
    println(name?.length)
}
fun tryCatch (name: String? = null) {
    try {
        println(name?.length ?: "Operador elvis paso por aquí")
        throw NullPointerException("Oculto el mensaje NullPointerException xD")
    } catch( exception: NullPointerException) {
        println("F-> $exception ")
    }finally{
        println("Siempre paso por aca :D")
    }

    val primerValor = 10
    val segundoValor= 0
    val result: Int = try { primerValor / segundoValor } catch (exception: Exception) { 0 }

}
