package reto5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto5 {
    public static void main(String[] args) {
        //  Estudiante A (HashSet) ---
        // Almacena sin orden y elimina múltiplos de 3
        Set<Integer> equipoA = new HashSet<>(Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5));
        Set<Integer> filtradoA = equipoA.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());

        // Estudiante B (TreeSet)
        // Almacena con orden y elimina múltiplos de 5
        Set<Integer> equipoB = new TreeSet<>(Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4));
        Set<Integer> filtradoB = equipoB.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toSet());

        //  UNIÓN Y CHOQUE
        Set<Integer> arenaFinal = Stream.concat(filtradoA.stream(), filtradoB.stream())
                .collect(Collectors.toCollection(TreeSet::new));

        //imprimo
        System.out.println("Batalla de Conjuntos Final");
        arenaFinal.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
