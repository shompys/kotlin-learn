package clases

class User (
    name: String,
    age: Int,
    private val dni: Int
    ) : Human(name, age) {

    fun hola(){
        println("$name dice hola")
    }
    //estatica
    companion object {
        private const val NUMERO_RANDOM = 10
        fun funcionEstatica (num: Int): Int{
            return NUMERO_RANDOM + num
        }
    }

    override fun gritar(){
        println("$name dice: aaaaaaaaAAAaAAah")
    }

    override fun toString(): String {
        return "User { $name, $age, $dni }"
    }

}