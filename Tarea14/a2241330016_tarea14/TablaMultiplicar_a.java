package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TablaMultiplicar_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;

        do {
            System.out.print("Introduce numero (de 0 a 10): ");
            num = Integer.parseInt(entrada.readLine());
        } while (num < 0 || num > 10);

        System.out.println("\nTabla del " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
