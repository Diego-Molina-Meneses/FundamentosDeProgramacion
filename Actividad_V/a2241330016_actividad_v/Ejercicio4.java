package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4 {
    public static void main(String[] args) {

        int suma = 0;

        for (int contador = 1; contador <= 100; contador++) {
            suma = suma + contador;
        }

        System.out.println("La suma de los primeros cien numeros es:");
        System.out.println(suma);
    }
}
