/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

/**
 *
 * @author Angelo
 */
public class Ejercicio_b {

    public int Sumanumeros(int valor) { // Se valida valor de entrada
        if (valor <= 0) {
            return -1;
        } else {
            return SumanumerosR(valor, 0);
        }

    }

    private int SumanumerosR(int valor, int resultado) {

        if (valor == 1) { //Condicion para finalizar
            return 1;
        } else {
            return valor + SumanumerosR(valor - 1, resultado); // Se realiza la recursividad del ejercicio

        }

    }

}
