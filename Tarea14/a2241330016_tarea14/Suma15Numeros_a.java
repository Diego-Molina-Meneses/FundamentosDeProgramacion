package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Suma15Numeros_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int suma = 0;

        for (int i = 1; i <= 15; i++) {

            System.out.print("Introduce numero: ");
            num = Integer.parseInt(entrada.readLine());

            suma += num;
        }

        System.out.println("La suma total es: " + suma);
    }
}
