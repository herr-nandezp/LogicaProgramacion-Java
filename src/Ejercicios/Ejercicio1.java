/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;// importar libreria escaneo 

public class Ejercicio1 {
    public static void main (String[]args){ //clase
        
        Scanner scanner =new Scanner(System.in);//creacion de objecto Scanner para poder guardar la entrada.
        
        int numero;//declaracion de variable
        
        do {
            System.out.print("Ingrese un numero entero para iniciar el conteo: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        
        if (numero % 2 == 0){
            System.out.print ("el numero "+ numero + " es par");
        }else {
            System.out.print("el numero "+ numero + " es impar");
        }
         
        scanner.close();
         
    }
    
}
