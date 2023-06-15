/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 16 junio 2022
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            entrada.useLocale(Locale.US);
            System.out.println("==========================================");
            System.out.print(" Ingrese nombre:\n > ");
            String n = entrada.nextLine();
            System.out.print(" Ingrese apellido:\n > ");
            String ap = entrada.nextLine();
            System.out.print(" Ingrese identificación:\n > ");
            String ced = entrada.nextLine();
            System.out.print(" Ingrese edad:\n > ");
            int edad = entrada.nextInt();
            System.out.print(" Ingrese número de créditos:\n > ");
            int creditos = entrada.nextInt();
            System.out.print(" Ingrese costo de créditos:\n > ");
            double costo = entrada.nextInt();
            EstudiantePresencial estPresencial = new EstudiantePresencial(n, ap,
                    ced,
                    edad, costo, creditos);
            estPresencial.calcularMatriculaPresencial();

            cadena = String.format("\n%s%s\n", cadena, estPresencial);

            entrada.nextLine();
            System.out.println("==========================================");
            System.out.print(" Digite 'si' para salir de programa:\n > ");
            String opcion = entrada.nextLine();

            if (opcion.equals("si")) {
                bandera = false;
            }
        }

        System.out.printf("%s", cadena);
    }
}
