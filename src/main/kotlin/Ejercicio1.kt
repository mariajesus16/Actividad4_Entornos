/*
Fecha: 26/01/2022
Versión:
Autor: María Jesús Borrego Vargas
Empresa/Entidad: IES Rafael Alberti
Proyecto: Actividad 4, Ejercicio 1
*/

fun nota(nota: Double) {
    when (nota) {
        in 0.0 .. 4.99 -> print("Suspenso")
        in 5.0..7.0 -> print("Aprobado")
        in 7.0..8.0 -> print("Notable")
        in 9.0..10.0 -> print("Sobresaliente")
        else -> print("El valor introducido no es correcto")
    }
}

fun main() {
    println("Introduce tu nota.")
    val nota = readLine()?.toDouble()
    if (nota != null) {
        nota(nota)
    }
}