/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]Args){
        Scanner scanner =new Scanner (System.in);
        
        int numero;
        int numeroinicial = 1;
        
        do {
            System.out.print ("Ingrese el numero hasta el que quiera contar: ");
            numero = scanner.nextInt();
        } while (numero < 0);
        
        do {
            
            System.out.print(numeroinicial);
            numeroinicial = numeroinicial + 1;
            
        } while (numeroinicial <= numero);
        
        scanner.close();
    }
}
