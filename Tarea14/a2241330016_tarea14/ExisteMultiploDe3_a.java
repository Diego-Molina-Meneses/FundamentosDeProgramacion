package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExisteMultiploDe3_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        boolean multiplo3 = false;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce numero: ");
            num = Integer.parseInt(entrada.readLine());

            if (num % 3 == 0) {
                multiplo3 = true;
            }
        }

        if (multiplo3) {
            System.out.println("Hay multiplos de 3");
        } else {
            System.out.println("No existen multiplos de 3");
        }
    }
}
