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

fun lists () {
    val ciruja = Ciruja("Juan", 20, "A")
    val ciruja2 = Ciruja("Juan", 20, "A")
    val user = User("Jonathan", 30, 36531959)
    val list = mutableListOf<Human>()
    val list2 = listOf<Human>(ciruja, user)
    list.add(ciruja)
    list.add(user)
    // println(list2.contains(ciruja2))
    list2.forEach{ human ->
        println()
        println(human)
     }

}



