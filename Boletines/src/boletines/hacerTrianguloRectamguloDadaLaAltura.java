/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seiryu
 */
public class hacerTrianguloRectamguloDadaLaAltura {

    public static void main(String[] args) {
        String mensaje = "ola";
        int max = 99, min = 0;
        pedirUnNumeroEntero(mensaje, 0, max, min);

    }

    static int pedirUnNumeroEntero(String mensaje, int numero, int max, int min) {

        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        do {
            System.out.println(mensaje);
            try {

                numero = sc.nextInt();
                if (numero > max || numero < min) {
                    throw new Exception("El número debe estar dentro de "
                            + min + " y el " + max);
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir algo valido");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            sc.nextLine();
        } while (valido == false);
        return numero;
    }

}
