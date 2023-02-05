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
       
        
        //=============== Ejercicio d =============== 
        calculos calc = new calculos(); //Se crea objeto del ejercicio d
        System.out.println("Resultado con ciclos");
        System.out.println(calc.calcExponencial(2, 5)); //Imprime la información con ciclos
        
        double resultado = calc.calcExpo(2, 5);  
        if(resultado == -1){
            System.out.println("=== [ERROR] : Uno de los valores es 0 ===");
            System.out.println(resultado);
        } else {
            System.out.println("\nResultado con recursividad");
            System.out.println(resultado); //Imprime la información con recursividad
        }
    }
    
}
