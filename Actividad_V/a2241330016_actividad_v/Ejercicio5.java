package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio5 {
    public static void main(String[] args) {

        int contador, resultado, tabla;

        for (tabla = 1; tabla <= 9; tabla++) {

            for (contador = 1; contador <= 10; contador++) {

                resultado = contador * tabla;
                System.out.println(tabla + " x " + contador + " = " + resultado);

            }

        }

    }
}
