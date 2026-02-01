package reto2;

import java.util.Arrays;
import java.util.List;

public class Reto2 {
    public static void main(String[] args) {
        List<Integer> datos = Arrays.asList(10, 45, 2, 33, 8, 15, 20);

        // Lógica: Número más grande y Múltiplo de 2
        int max = datos.stream().max(Integer::compare).orElse(0);
        String msgMax = (max % 2 == 0) ? "es múltiplo de 2" : "no es múltiplo de 2";
        System.out.println("El número mayor es: " + max + " y " + msgMax);

        // Lógica: Número más pequeño y Divisor de 2
        int min = datos.stream().min(Integer::compare).orElse(0);
        long cantidad = datos.stream().count();
        String msgMin = (2 % min == 0) ? "es divisor de 2" : "no es divisor de 2";

        System.out.println("El número menor es: " + min + " (" + msgMin + ")");
        System.out.println("Cantidad total de datos: " + cantidad);
    }
}
