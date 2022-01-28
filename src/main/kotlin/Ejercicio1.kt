/*
Fecha: 26/01/2022
Versión:
Autor: María Jesús Borrego Vargas
Empresa/Entidad: IES Rafael Alberti
Proyecto: Actividad 4, Ejercicio 1
*/

fun nota(nota: Int) {
    when (nota) {
        in 0..5 -> print("Suspenso")
        in 5..7 -> print("Aprobado")
        in 7..8-> print("Notable")
        in 9..10-> print("Sobresaliente")
        else -> print("El valor introducido no es correcto")
    }
}

fun main(){

}