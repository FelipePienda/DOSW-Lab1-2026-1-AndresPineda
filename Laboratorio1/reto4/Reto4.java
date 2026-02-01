package reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {
    public static void main(String[] args) {

        // HashMap : Ignora duplicados, conserva el primero
        Map<String, Integer> mapaA = new HashMap<>();
        mapaA.putIfAbsent("oro", 5);
        mapaA.putIfAbsent("plata", 3);
        mapaA.putIfAbsent("oro", 7);
        mapaA.putIfAbsent("diamante", 10);

        // Hashtable el otro estudiante: Sincronizado
        Map<String, Integer> mapaB = new Hashtable<>();
        mapaB.put("plata", 8);
        mapaB.put("rubí", 4);
        mapaB.put("oro", 12);
        mapaB.put("esmeralda", 6);

        Map<String, Integer> tesoroFinal = unificarMapas(mapaA, mapaB);

        //  Mayúsculas y Orden Ascendente
        System.out.println("--- Contenido del Cofre del Tesoro ---");
        tesoroFinal.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
    }

    public static Map<String, Integer> unificarMapas(Map<String, Integer> hMap, Map<String, Integer> hTable) {
        // Combinar ambos mapas en un stream
        return java.util.stream.Stream.concat(hMap.entrySet().stream(), hTable.entrySet().stream())
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(), // Requisito: Convertir claves a MAYÚSCULAS
                        entry -> entry.getValue(),
                        (valA, valB) -> valB, // Requisito: En conflicto, prioriza el valor del Hashtable (valB)
                        TreeMap::new // Requisito: Ordenar las claves de forma ascendente
                ));
    }
}
