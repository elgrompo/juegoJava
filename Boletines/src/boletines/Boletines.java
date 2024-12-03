/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletines;

import java.util.Scanner;

/**
 *
 * @author Seiryu
 */
public class Boletines {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número para redondearlo");
        double numero = sc.nextDouble();

        System.out.println("Su numero redondeado será: " + redondearNumero(numero));

    }

    public static void redondearIntroducido() {
        Scanner sc = new Scanner(System.in);
        double numero;

        System.out.println("Introduzca el número que desea redondear");
        numero = sc.nextDouble();

        numero = Math.round(numero);
        System.out.println("Su numero rendondeado será: " + numero);
    }

    public static double redondearNumero(double numero) {
        double i;
        i = (int) numero;
        numero -= i;
        numero *= 10;

        if (numero > 5) {
            i++;
        }

        return i;
    }
}
