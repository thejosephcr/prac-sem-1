/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Sem1;

/**
 *
 * @author jcastellon
 */
public class Ejercicio_c {
    // Funcion para comprobar Binarios
    public static boolean NumeroBinario(int num)    
    {
        // Muestra False si el numero es numero negativo
        if (num < 0) {
                return false;
        }
        // Obtiene el dígito más a la derecha del número con la ayuda del 
        // operador '%' dividiéndolo por 10
        while (num != 0) {

            // Si el dígito es mayor que 1 devuelve falso
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        // Si el numero es binario retorna True
        return true;
    }

    // Recursividad
    public static int NumeroBin(int num){
        // Retorna -1 si el numero es numero negativo
        if (num < 0){
            return -1;
        } else {
        // Llama a la funcion recursiva privada
            return NumeroBinarioR(num);
        }
    }

    private static int NumeroBinarioR(int num){
        // Obtiene el dígito más a la derecha del número con la ayuda del 
        // operador '%' dividiéndolo por 10
        if (num != 0){
            if (num % 10 > 1) {
                return -1;
            }
        num = num / 10;
        num = NumeroBinarioR(num);    
    }
    // Si el numero es binario retorna 1
    return 1;
    }
}
