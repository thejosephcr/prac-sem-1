/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprobarbinario;

/**
 *
 * @author jcastellon
 */
public class comprobarBin {
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
        return true;
    }

    // Recursividad
    public static int NumeroBin(int num){
        if (num < 0){
            return -1;
        } else {
            return NumeroBinarioR(num);
        }
    }

    private static int NumeroBinarioR(int num){
        if (num != 0){
            if (num % 10 > 1) {
                return -1;
            }
            num = num / 10;
        num = NumeroBinarioR(num);    
    }
    return 1;
    }
}
