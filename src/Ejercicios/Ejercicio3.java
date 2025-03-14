/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[]args){
    
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(10) + 1;
        int intento;
        
        System.out.print("Adivina el numero entre el 1 y 10");
        
        while (true){
            
            System.out.print("Ingresa tu numero: ");
            intento = scanner.nextInt();
            
            if (intento < 1 || intento > 10) {
                System.out.println("Por favor, ingresa un número entre 1 y 10.");
                continue;
            }
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número.");
                break; // Salimos del bucle porque el usuario acertó
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
            
        }
        
}
}
