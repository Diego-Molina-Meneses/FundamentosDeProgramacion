package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PositivoNegativo_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        for (; num != 0; ) {

            if (num > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }

            System.out.print("Introduce otro numero: ");
            num = Integer.parseInt(entrada.readLine());
        }

        System.out.println("Programa terminado.");
    }
}
