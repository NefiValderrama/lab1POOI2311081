/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act01sem03.nefi_valderrama.ejercicio5;

/**
 *
 * @author Valderrama
 */
import java.util.Scanner;

public class Act01Sem03Nefi_ValderramaEjercicio5 {

    public static void main(String[] args) {
    //EJERCICIO 5:
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            default -> System.out.println("Domingo");
        }
    }
}
