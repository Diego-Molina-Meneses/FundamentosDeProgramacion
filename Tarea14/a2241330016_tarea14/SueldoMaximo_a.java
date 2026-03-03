package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SueldoMaximo_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int sueldo;
        int sueldo_max = 0;
        int n;

        System.out.print("Numero de sueldos: ");
        n = Integer.parseInt(entrada.readLine());

        for (int i = 1; i <= n; i++) {

            System.out.print("Introduce sueldo: ");
            sueldo = Integer.parseInt(entrada.readLine());

            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
        }

        System.out.println("El sueldo maximo es: " + sueldo_max);
    }
}
