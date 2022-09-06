import clases.Ciruja
import clases.Human
import clases.User
import interfaces.DownloadThread
import interfaces.DownloadThread2
import java.util.Scanner

fun arr (){
    val intArray = intArrayOf(1, 50, 100)
    val booleanArray = booleanArrayOf(true, false, true)
    val doubleArray = DoubleArray(3){50.0} // [50.0, 50.0, 50.0]
    val playList = arrayOf("batman", "matrix", "rick and morty", "ted")
}

fun dataEntry (): Unit {
    val scanner = Scanner(System.`in`)
    print("Ingresar nombre: ")
    val name = readLine()
    print("Ingresar edad: ")
    val age= scanner.nextInt()
    println("Nombre: $name, Edad: $age")
}
fun triggerClasses(): Unit {

    val downloadThread = DownloadThread()

    downloadThread.downloadThread(object: DownloadThread.DownloadListener {
        override fun onDownloadFinished(ciruja: Ciruja) {
            ciruja.gritar()
        }

    })
    // Otra manera de aplicar mas abstracto
    val downloadThread2 = DownloadThread2()

    // lambda
    downloadThread.downloadThread {  downloadThread.downloadThread {
        ciruja ->
        ciruja.gritar()
    }}

    val scanner = Scanner(System.`in`)
    print("Automatizamos la carga? si - no : ")
    val isAutomatic = scanner.nextLine()
    val user = if( isAutomatic.equals("si")){
        User("Pepito", 20, 9999999)
    }else {
        print("Ingresar NOMBRE: ")
        val name = scanner.nextLine()
        print("Ingresar EDAD: ")
        val age = scanner.nextInt()
        print("Ingresar DNI: ")
        val dni = scanner.nextInt()
        User(name, age, dni)
    }
    val ciruja = Ciruja("cacho", 50, "calle")
    user.gritar()
    user.hola()
    User.funcionEstatica(1)
    ciruja.gritar()
}

fun triggerclasses2 (){
    val ciruja1 = Ciruja("Juan", 20, "A")
    val ciruja2 = Ciruja("Juan", 20, "A")
    val isEqual = ciruja1 == ciruja2
    println(isEqual)

}
fun <T> MutableList<T>.addIfNotInList(myObject: T) {
    //Esta caracteristica se llama extension y estoy agregando metodos a la clase MutableList !!
    if(!this.contains(myObject)){
        this.add(myObject)
        return
    }
    println("$myObject ya se encuentra en la lista")
}
fun lists () {
    val ciruja = Ciruja("Juan", 20, "A")
    val ciruja2 = Ciruja("Juan", 20, "B")
    val user = User("Jonathan", 30, 36531959)
    val list = mutableListOf<Human>()
    val list2 = listOf<Human>(ciruja, user)
    list.add(ciruja)
    list.addIfNotInList(ciruja2)
    list.add(user)
    println(list)
    // println(list2.contains(ciruja2))
    list2.forEach{ human ->
        println()
        println(human)
     }
}

fun hashMaps () {
    val ciruja = Ciruja("Juan", 20, "A")
    val ciruja2 = Ciruja("Juan", 20, "A")
    val user = User("Jonathan", 30, 36531959)

    val hashHuman = HashMap<Int, Human>()
    println(hashHuman)
    hashHuman[1] = ciruja
    hashHuman.put(2, ciruja2)
    hashHuman.put(3, user)
    println(hashHuman[2])
}

fun lambdas () {

    val myLambda: (String) -> Int = { valor -> valor.length }


    fun superFunction(valorInicial: String, block: (String) -> Int): Int {
        return block(valorInicial)
    }
    superFunction(valorInicial = "asdasd", myLambda)
    val l = superFunction(valorInicial="hola") { valor -> valor.length }
    println(l)
}

fun functionRun () {
    val listado = mutableListOf("uno", "dos", "tres", "cuatro", "cinco")
    listado.run { removeIf{ t -> t.contains("uno")} }
    println(listado)
}

fun functionApply () {
    // acepta valores nulos
    val listado = mutableListOf("uno", "dos", "tres", "cuatro", "cinco").apply {
        removeIf { t -> t.contains("uno") }
    }
    println(listado)
}

fun functionAlso () {
    // Permite ejecutar codigo dentro
    val listado = mutableListOf("uno", "dos", "tres", "cuatro", "cinco").also {
        t -> println("$t wtf")
    }.asReversed()
    println(listado)
}




