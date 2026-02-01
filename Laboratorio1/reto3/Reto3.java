package reto3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.UnaryOperator;

public class Reto3 {
    public static void main(String[] args) {
        String mensajeOriginal = "Eco";

        //  Repetir 3 veces usando StringBuilder + Stream
        // Invertir usando StringBuffer
        UnaryOperator<String> procesarEco = mensaje -> {
            //  Repetir 3 veces con Stream y StringBuilder
            String repetido = IntStream.range(0, 3)
                    .mapToObj(i -> mensaje)
                    .collect(Collectors.joining(" "));

            StringBuilder sb = new StringBuilder(repetido);

            //  Invertir usando StringBuffer
            StringBuffer sbf = new StringBuffer(sb.toString());
            return sbf.reverse().toString();
        };

        // imprimo
        String resultadoFinal = procesarEco.apply(mensajeOriginal);

        System.out.println("Mensaje Original: " + mensajeOriginal);
        System.out.println("Eco de la Cueva: " + resultadoFinal);
    }
}
