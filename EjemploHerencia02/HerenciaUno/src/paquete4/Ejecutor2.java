package paquete4;

public class Ejecutor2 {

    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "Sebastián";
        String apellido = "Calderón";
        String identificacion = "1105747016";
        int edad = 18;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);

        estPresencial.establecerNumeroCreditos(10);
        estPresencial.establecerCostoCredito(5);
        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);
    }
}
