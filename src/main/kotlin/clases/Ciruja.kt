package clases

class Ciruja(name: String, age: Int, private val state: String): Human(name, age), Comparable<Ciruja> {

    override fun gritar() {
        println("$name dice: Tengo hambreeee!!!!")
    }

    override fun toString(): String {
        // podria armar una logica mas dinamica pero esto asi se parece al javascript xD
        return "Ciruja { $name, $age, $state }"
    }

    override fun compareTo(other: Ciruja): Int {
        return this.name.compareTo(other.name)
    }

    override fun equals(other: Any?): Boolean {
        return other != null && other is Ciruja && other.name == this.name && other.age == this.age && other.state == this.state
    }

    override fun hashCode(): Int {
        return state.hashCode()
    }
}