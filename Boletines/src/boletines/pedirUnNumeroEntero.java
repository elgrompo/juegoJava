/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seiryu-1
 */
public class pedirUnNumeroEntero {

    public static void main(String[] args) {
        String hola = "hola";

        pedirEntMinMax(hola, 0, 99);
    }

    public static int pedirEntMinMax(String mensaje, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        boolean valido;
        do {
            valido = true;
            try {
                System.out.println(mensaje);
                dato = sc.nextInt();
                if (dato < min || dato > max) {
                    throw new Exception("Debe introducir un número entre " + min + " y " + max + ". Intentelo de nuevo.");
                }
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un número Entero. Inténtelo de nuevo");
                valido = false;
            } catch (Exception e) {
                valido = false;
                System.out.println(e.getMessage());
            }
            sc.nextLine();
        } while (valido != true);
        return dato;
    }
}
