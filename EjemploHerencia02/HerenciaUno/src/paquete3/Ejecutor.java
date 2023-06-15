/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudianteDistancia estDistancia = new EstudianteDistancia(nombre,
                apellido, identificacion, edad);

        EstudiantePresencial estPresencial = new EstudiantePresencial("Sebastián",
                "Calderón", "1105747016", 18);

        System.out.println(estDistancia);
        System.out.println("");
        System.out.println(estPresencial);

    }
}
