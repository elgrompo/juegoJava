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
public class Bol4Ej8 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número que desea ver cuantos "
                + "divisores primos tiene");
        numero = sc.nextInt();
        System.out.println("La cantidad de divisores primos que se encuentran"
                + "es " + calcularNumeroDeDivisoresPrimos(numero));

    }

    public static int calcularNumeroDeDivisoresPrimos(int numero) {
        int cantidad = 0, divisores = 0;
        for (int i = 1; i < (numero + 1); i++) {
            if (numero % i == 0) {
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
        }
        return cantidad;
    }
}
