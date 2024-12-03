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
public class Bols2Ej14 {

    public static void main(String[] args) {
        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia");
        dia = sc.nextInt();
        System.out.println("Introduzca el mes");
        mes = sc.nextInt();
        System.out.println("Introduzca el año");
        ano = sc.nextInt();

        if ((dia < 0) || (mes < 0) || (ano < 0)) {
            System.out.println("No puede introducir fechas negativas");
        } else {

            dia++;
            if ((dia > 32) || (mes > 12) || (mes % 2 == 0 && dia > 32 && mes != 2)
                    || (mes % 2 != 0 && dia > 31) || (mes == 2 && dia > 29)) {

                System.out.println("La fecha introducida no es valida");

            } else {
                if (mes % 2 == 0 && dia > 30 && mes != 2) {
                    dia = dia % 31;
                    mes++;
                }
                if (mes % 2 != 0 && dia > 31) {
                    dia = dia % 31;
                    mes++;
                }
                if (mes == 2 && dia == 29) {
                    dia = dia % 28;
                    mes++;
                }
                if (mes > 12) {
                    mes = mes % 12;
                    ano++;
                }
                System.out.println("El siguiente día es el " + dia + " del "
                        + mes + " del " + ano);

            }
        }
    }
}
