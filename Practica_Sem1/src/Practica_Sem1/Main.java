/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica_Sem1;

import javax.swing.JOptionPane;

/**
 *
 * @author araya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //=============== Ejercicio a ===============   
        Ejercicio_a a = new Ejercicio_a();
        String oracion = JOptionPane.showInputDialog("Ej A: Digite una oración ");
        /*
            Imprimir en pantalla el resultado del llamado a la funcion 
            quitarVocales que recibe por parametro la oracion que digito el usuario
         */
        if (a.quitarVocales(oracion) == null || oracion.isEmpty() || a.quitarVocales(oracion) == " ") {
            JOptionPane.showMessageDialog(null, " === [ERROR]: Valor vacio ===");
        } else {

            JOptionPane.showMessageDialog(null, "Su oración sin vocales: \n"
                    + a.quitarVocales(oracion));
        }

        //=============== Ejercicio b ===============       
        Ejercicio_b sumaNumeros = new Ejercicio_b();    // Se llama a la clase Ejercicio_b, se le asigna el nombre del objeto y se iguala a new Ejercicio_b() para llamar al constructor

        int dato = sumaNumeros.Sumanumeros(3); // Se pone el nombre del objeto . y el metodo creado y se le envia el valor de entrada

        System.out.println("---------- Ejercicio b ----------");
        if (dato == -1) { // Se valida valor de entrada
            System.out.println("=== [ERROR]: No es un numero natural ===");
        } else {
            System.out.printf("El resultado del ejercicio b es: %d\n", dato);

        }
        System.out.println(" ");

        //=============== Ejercicio c ===============       
        // Numero a comprobar
        int N = 101;

        // Llamada de la funcion comprobar binario
        System.out.println("Resultado con ciclo");
        System.out.println("El numero es binario?");
        System.out.println(Ejercicio_c.NumeroBinario(N));

        // Llamada de la funcion comprobar binario recursiva
        int bin = Ejercicio_c.NumeroBin(N);
        if (bin == -1) {
            System.out.println("Resultado con recursividad");
            System.out.println("El numero no es binario");
        } else if (bin == 1) {
            System.out.println("Resultado con recursividad");
            System.out.println("El numero es binario");
        }

        //=============== Ejercicio d =============== 
        Ejercicio_d calc = new Ejercicio_d(); //Se crea objeto del ejercicio d
        System.out.println("---------- Ejercicio d ----------");
        System.out.println("Resultado con ciclos del ejercicio d:");
        System.out.println(calc.calcExponencial(2, 5)); //Imprime la información con ciclos

        double resultado = calc.calcExpo(2, 5);
        if (resultado == -1) {
            System.out.println("=== [ERROR] : Uno de los valores es 0 ===");
            System.out.println(resultado);
        } else {
            System.out.println("\nResultado con recursividad del ejercicio d:");
            System.out.println(resultado); //Imprime la información con recursividad
        }
    }

}
