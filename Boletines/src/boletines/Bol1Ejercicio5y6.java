/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import static boletines.Boletines.redondearNumero;
import java.util.Scanner;

/**
 *
 * @author Seiryu
 */
public class Bol1Ejercicio5y6 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las nota a");
        a = sc.nextInt();
        System.out.println(a);
        System.out.println("Introduzca las nota b");
        b = sc.nextInt();
        System.out.println(b);
        System.out.println("Introduzca las nota c");
        c = sc.nextInt();
        System.out.println(c);

        System.out.println("La media redondeada, sera: "
                + (int)redondearNumero(mediaDeDosNotas(a, b, c)));

    }

    public static double mediaDeDosNotas(double a, double b, double c) {
        return ((a + b + c) / 3);
    }
}
