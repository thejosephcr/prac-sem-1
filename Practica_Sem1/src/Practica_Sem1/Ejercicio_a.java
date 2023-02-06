/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Sem1;


/**
 *
 * @author Usuario
 */
public class Ejercicio_a {

    /*
        Función que permita quitar las vocales
     */
    public String quitarVocales(String oracion) {
        if (oracion != " ") {
            return quitarVocalesR(oracion, ' ');
        } else {
            return oracion;
        }
    }

    private String quitarVocalesR(String oracion, char primeraLetra) {
        /*
            Si la oración esta vacia devuelve la variable
         */
        if (oracion.length() == 0) {
            return oracion;
        } else {
            /*
                Obtenemos la primera letra de la oracion para empezar a comparalo
             */
            primeraLetra = oracion.charAt(0);
            /*
                Se compara el caracter para ver si es una vocal minuscula o Mayuscula
             */
            if (primeraLetra == 'a' || primeraLetra == 'A'
                    || primeraLetra == 'e' || primeraLetra == 'E'
                    || primeraLetra == 'i' || primeraLetra == 'I'
                    || primeraLetra == 'o' || primeraLetra == 'O'
                    || primeraLetra == 'u' || primeraLetra == 'U') {
                /*
                    Si existe una vocal elimina el caracter de esa oración con la funcion
                    substring()
                 */
                return quitarVocalesR(oracion.substring(1), ' ');
            } else {
                /*
                    Si no es una vocal no la elimina y sigue con la siguiente letra
                 */
                return primeraLetra + quitarVocalesR(oracion.substring(1), ' ');
            }
        }

    }
}
