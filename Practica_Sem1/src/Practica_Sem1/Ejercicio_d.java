/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Sem1;

/**
 *
 * @author araya
 */
public class Ejercicio_d {

    public double calcExponencial(int n, int x) { //Metodo con ciclo
        double result = 0;
        for (int i = 0; i < n; i++) { //Condición de parada
            result = result + (Math.pow(x, i) / factorial(i)); // Calculo de resultado
        }
        return result; //Retorno de resultado
    }

    public double factorial(int num) { //Metodo ciclo
        double result = 1;
        for (int i = 1; i <= num; i++) { //Condicion de parada y suma
            result = result * i; //Calculo de resultado
        }
        return result;
    }

    public double calcExpo(int n, int x) { // Metodo de verificacion
        if (n == 0 || x == 0) {
            return -1; // -1 simbolisa un error al ingresar 0 en los valores n o x
        } else {
            return calcExpoR(n, x, 0, 0);
        }
    }

    private double calcExpoR(int n, int x, int i, double result) { //Metodo recursivo
        if (i < n) {
            result = result + (Math.pow(x, i) / calcFactorial(i)); //Se calcula el resultado
            return calcExpoR(n, x, i + 1, result); //Reliza llamada recursiva con los valores invariables y nuevos
        } else {
            return result; //Se retorna el valor en caso que no cumpla la condición
        }
    }

    public double calcFactorial(int num) { // Metodo de verificacion

        return calcFactorialR(num, 1, 1);
    }

    public double calcFactorialR(int num, int i, double result) { // Metodo recursivo
        if (i <= num) {
            result = result * i; //Calculo de resultado
            return calcFactorialR(num, i + 1, result); //Llamada recursiva
        } else {
            return result;
        }
    }
}
