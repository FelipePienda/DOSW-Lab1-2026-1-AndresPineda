package reto1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Objeto Estudiante requerido [cite: 345]
class Estudiante {
    String nombre;
    int edad;
    String correo;
    int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }
}

public class Reto1 {
    public static void main(String[] args) {

        List<Estudiante> pareja = Arrays.asList(
                new Estudiante("Andres Pineda", 24, "andres.pineda-g@mail.escuelaing.edu.co", 8)

        );

        // Uso obligatorio de stream(), map() y collect()
        String mensajeBienvenida = "Hola, bienvenidos soy andres " +
                pareja.stream()
                        .map(e -> e.nombre + ", estudiante de la escuela de " + e.semestre + ".° semestre de " + e.edad + " años")
                        .collect(Collectors.joining(", y ")) +
                ". mi  correo institucional es " +
                pareja.stream()
                        .map(e -> e.correo)
                        .collect(Collectors.joining(" y ")) + ".";

        System.out.println(mensajeBienvenida);
    }
}