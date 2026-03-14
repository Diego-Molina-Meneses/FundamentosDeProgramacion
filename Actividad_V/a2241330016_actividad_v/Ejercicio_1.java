package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {

        int numero = 1;
        int contador = 0;

        while (contador < 50) {
            System.out.println(numero);
            numero = numero + 2;
            contador = contador + 1;
        }

    }
}
