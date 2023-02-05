/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculos;

/**
 *
 * @author araya
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         
        //=============== Ejercicio a ===============       
        
        
        //=============== Ejercicio b ===============       
        Ejercicio_b sumaNumeros = new Ejercicio_b();    // Se llama a la clase Ejercicio_b, se le asigna el nombre del objeto y se iguala a new Ejercicio_b() para llamar al constructor

        int dato = sumaNumeros.Sumanumeros(4); // Se pone el nombre del objeto . y el metodo creado y se le envia el valor de entrada

        System.out.println("---------- Ejercicio b ----------");
        if (dato == -1) { // Se valida valor de entrada
            System.out.println("=== [ERROR]: No es un numero natural ===");
        } else {
            System.out.printf("El resultado del ejercicio b es: %d\n", dato);

        }
        System.out.println(" ");

        //=============== Ejercicio c ===============       
        
        //=============== Ejercicio d =============== 
        calculos calc = new calculos(); //Se crea objeto del ejercicio d
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
