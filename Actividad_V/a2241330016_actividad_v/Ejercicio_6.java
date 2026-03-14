package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_6 {
    public static void main(String[] args) throws IOException {

        int numero = 1;
        int suma = 0;

        while (numero <= 100) {

            suma = suma + numero;
            numero = numero + 1;

        }

        System.out.println("La suma de los primeros 100 numeros es:");
        System.out.println(suma);
    }
}
