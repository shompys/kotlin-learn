fun structuresControl () {
    fun structureConditions(){
        val name = "Jonathan"

        if(name.isNotEmpty()) {
            println("result: ${name.length}")
        }else if(name.length > 1) {
            println("Else -> ${name.isNotEmpty()}")
        }else{
            println("solo un character :(")
        }

        if(name.isNotEmpty()) println("") else println("")

        val msg: String = if (name.length > 4) { "true" } else { "false" }
    }
    fun structureWhen () {
        when (val color= "blue"){
            "red" -> println("Este es el color red")
            "yellow" -> {
                println("Este es el color yellow")
            }
            "blue", "azul" -> println("Este color es blue o azul: $color")
            else -> println("Error. No es ningún color")
        }
        when(val code = 200){
            in 200..299 -> println("Todo salio bien")
            in 400..500 -> println("Algo ha fallado")
            else -> println("Codigo desconocido, algo fallo")
        }
        fun message(number: Int = 41) = println(when(number) {
            41,43 -> "Tenemos el talle"
            42,44 -> "Casi no nos quedan!"
            45 -> "No tenemos"
            else -> "todo mal"
        })
        message()
    }
    fun structureWhile (count: Int = 0) {

        var counts = count
        while(counts < 10) {
            println(counts)
            counts++
        }
    }
    fun structureDoWhile(){
        do {
            println("Numero aleatorio...")
            val numberRandom = (0..100).random()
            println(numberRandom)

        } while(numberRandom < 100)
    }
    fun structureFor(){
        val fruits = listOf("manzana", "pera", "banana", "durazno")
        for(fruit in fruits){
            println("Fruta: $fruit")
        }
        for(fruit in fruits) println("Fruta2: $fruit")

    }
    fun structureForEach (){
        val fruits = listOf("manzana", "pera", "banana", "durazno")
        fruits.forEach{ fruit -> println("Fruta: $fruit") }
    }
    fun structureMap (){
        val fruits: List<String> = listOf("manzana", "pera", "banana", "durazno")
        val charactersNumber: List<Int> = fruits.map{ fruit -> fruit.length }
        println("$charactersNumber")
    }
    fun structureFilter (){
        val fruits: List<String> = listOf("manzana", "pera", "banana", "durazno")
        val fruitsFilters: List<String> = fruits.filter { fruit -> fruit.length > 4}
        println("lista filtrada: $fruitsFilters")
    }
}



