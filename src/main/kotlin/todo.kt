import clases.User
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

    user.gritar()
}
