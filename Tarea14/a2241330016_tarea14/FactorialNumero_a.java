package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FactorialNumero_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        long factorial = 1;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
