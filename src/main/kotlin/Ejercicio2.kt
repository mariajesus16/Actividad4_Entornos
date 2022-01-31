import java.util.*
import kotlin.random.Random

/*
Fecha: 26/01/2022
Versión:
Autor: María Jesús Borrego Vargas
Empresa/Entidad: IES Rafael Alberti
Proyecto: Actividad 4, Ejercicio 2
*/
fun array(): Array<Int?> {
    var array = arrayOfNulls<Int>(20)
    for (i in 0 until 20) {
        array[i] = Random.nextInt(0, 100)
    }
    return array
}


fun main() {
    val a = array()
    println(a.contentToString())
    for (i in 0 until 20) {
        if (a[i] != null) {
            if (a[i]?.rem(2) == 0) {
                print(" " + a[i])
            }
        }
    }
    println()
    a.sort()
    println(a.contentToString())
    println()
    val sumaArray= a.sumOf{ it!! }
    println("La suma de todos los elementos que contiene la array es $sumaArray")
}