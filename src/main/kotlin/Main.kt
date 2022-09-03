import structuresControl
import nullSafety
import tryCatch
import arr
import clases.User
import dataEntry
// Variable de solo lectura que se genera y asigna en tiempo de compilación.
const val PI = 3.1416

fun main (args: Array<String>) {

    var money = 10; //read and write
    money = 5

    // Variable de solo lectura que se asigna en tiempo de ejecución.
    val firstName = "Jonathan"
    val lastName = "Gomez"

    // interpolacion o template
    val fullName = "$firstName $lastName"

    // -- tipos de datos -- //

    val boolean : Boolean = true
    val numeroLargo : Long = 3L // o tambien -> 3000000000000000000
    val double: Double = 2.11
    val float : Float = 1.1f
    val value: Int = 10;
    val string : String = "";
    // algunos metodos y propiedades de String:
    // .length .isEmpty() .contains("insertar string") .substring(0, 1) .replace("e", "o")
    // -- operaciones === funciones -- //
    //String.format("formatos imprimibles %s %d %.2f %f", name, age, altura, peso)
    /**
     * c = a + b	public operator fun plus(other: Int): Int
     * c = a - b	public operator fun minus(other: Int): Int
     * c = a * b	public operator fun times(other: Int): Int
     * c = a / b	public operator fun div(other: Int): Int
     * c = a % b	public operator fun rem(other: Int): Int
     * c = a++	public operator fun inc(): Int
     * c = a–	public operator fun dec(): Int
     * c = a > b	public override operator fun compareTo(other: Int): Int
     * c = a < b	public override operator fun compareTo(other: Int): Int
     * c = a >= b	public override operator fun compareTo(other: Int): Int
     * c = a <= b	public override operator fun compareTo(other: Int): Int
     * c = a != b	public open operator fun equals(other: Any?): Boolean
    **/
    // structuresControl()
    //nullSafety()
    //tryCatch()
    // arr()
    // dataEntry()
    // triggerClasses()
    // triggerclasses2()
    lists()
}
