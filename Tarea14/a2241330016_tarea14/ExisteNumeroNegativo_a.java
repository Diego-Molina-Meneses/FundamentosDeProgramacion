package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExisteNumeroNegativo_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        boolean hay_negativo = false;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Introduce numero: ");
            num = Integer.parseInt(entrada.readLine());

            if (num < 0) {
                hay_negativo = true;
            }
        }

        if (hay_negativo) {
            System.out.println("Se ha introducido algun numero negativo");
        } else {
            System.out.println("No hay ningun numero negativo");
        }
    }
}
