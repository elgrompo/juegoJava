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
public class Tarea2Ej1 {

    public static void main(String[] args) {
        menuParaCajero();

    }

    @SuppressWarnings("empty-statement")
    public static void menuParaCajero() {
        Scanner sc = new Scanner(System.in);

        String nuevoPin;
        boolean salir = true, pinValido = false;
        int opcion;
        do {

            System.out.println("------------------------");
            System.out.println("-   |1-RETIRAR DINERO| -");
            System.out.println("-   |   2-INGRESAR   | -");
            System.out.println("-   |   3-CONSULTAR  | -");
            System.out.println("-   |  4-CAMBIAR PIN | -");
            System.out.println("-   |   0-CANCELAR   | -");
            System.out.println("------------------------");
            System.out.println("    ¿Qué opción desea?  ");

            salir = true;
            pinValido = false;
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("                                     ");
                    }
                    salir = false;
                    break;
                case 1:
                    System.out.println("Introduzca la cantidad a retirar");
                    int cantidadRetirar = sc.nextInt();
                    System.out.println("    SALDO INSUFICIENTE  ");
                    break;
                case 2:
                    System.out.println("Coloque el dinero en el cajetín de entrada");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("Error inesperado");
                    }
                    System.out.println("Pulse ENTER para continuar");
                    sc.nextLine();
                    if (sc.nextLine() != null) {
                        for (int i = 0; i < 10; i++) {
                            System.out.println("                                     ");

                        }

                    }

                    break;
                case 3:
                    System.out.println("No hay conexión con su entidad");
                    System.out.println("Pulse ENTER para continuar");
                    sc.nextLine();
                    if (sc.nextLine() != null) {
                        for (int i = 0; i < 10; i++) {
                            System.out.println("                                     ");

                        }

                    }

                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Introduzca el nuevo PIN");
                    nuevoPin = sc.nextLine();
                    if (nuevoPin.length() == 4) {
                        pinValido = true;
                    }
                    if (pinValido == true) {
                        System.out.println("PIN cambiado");
                        System.out.println("Pulse ENTER para continuar");
                        sc.nextLine();

                        for (int i = 0; i < 10; i++) {
                            System.out.println("                                     ");
                            if (i == 9) {
                                break;
                            }
                        }

                    } else {

                        System.out.println("El PIN introducido no es válido, PIN no cambiado");
                        System.out.println("Pulse ENTER para continuar");
                        sc.nextLine();

                        for (int i = 0; i < 10; i++) {
                            System.out.println("                                     ");
                            if (i == 9) {
                                break;
                            }

                        }

                    }

            }

        } while (salir == true);
    }
}
