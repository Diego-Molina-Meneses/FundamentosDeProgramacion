package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SueldosMayores1000_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int sueldo;
        int suma = 0;
        int mayor_1000 = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Escribe un sueldo: ");
            sueldo = Integer.parseInt(entrada.readLine());

            suma += sueldo;

            if (sueldo > 1000) {
                mayor_1000++;
            }
        }

        System.out.println("Mayores de 1000 hay: " + mayor_1000);
        System.out.println("La suma es: " + suma);
    }
}
