/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import java.util.Scanner;

/**
 *
 * @author Seiryu
 */
public class Bol {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca N");
        n = sc.nextInt();

        System.out.println("La cantidad de números primos que hay entre el 1 y "
                + n + ", es: " + calcularCuantosPrimosHay(n));

    }

    public static int calcularCuantosPrimosHay(int n) {
        int cantidad = 0, divisores = 0;
        for (int i = 2; i < (n + 1); i++) {
            for (int j = 1; j < (i + 1); j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                cantidad++;

            }
            divisores = 0;
        }
        return cantidad;
    }

}
