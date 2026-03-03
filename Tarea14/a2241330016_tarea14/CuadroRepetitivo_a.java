package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CuadroRepetitivo_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int cuadrado;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        for (; num >= 0; ) {

            cuadrado = num * num;
            System.out.println("El cuadrado es: " + cuadrado);

            System.out.print("Introduce otro numero: ");
            num = Integer.parseInt(entrada.readLine());
        }

        System.out.println("Programa terminado.");
    }
}
