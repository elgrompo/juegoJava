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
public class Bol2Ej6 {

    public static void main(String[] args) {
        mostrarDosNumerosDecreciente();
    }

    public static void mostrarDosNumerosDecreciente() {
        int numero, numeroMayor = 0, num;
        String sumaDeNumeros = "", simboloMayor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números que desea evaluar");

        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Introduzca el número");
            numero = sc.nextInt();
            if (i == 0) {
                numeroMayor = numero;
                simboloMayor = "";
            } else {
                simboloMayor = " > ";
            }
            if (numero > numeroMayor) {
                numeroMayor = numero;
                sumaDeNumeros = numero + simboloMayor + sumaDeNumeros;
            } else {
                sumaDeNumeros = sumaDeNumeros + simboloMayor + numero;
            }
        }
        System.out.println("Los números ordenados de mayor a menor, serán: " + sumaDeNumeros);
    }
}
