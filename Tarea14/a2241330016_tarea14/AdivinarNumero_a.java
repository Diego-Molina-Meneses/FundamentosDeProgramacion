package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AdivinarNumero_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n, num;

        System.out.print("Introduce el numero secreto: ");
        n = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        for (; num != n; ) {

            if (num < n) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }

            System.out.print("Introduce otro numero: ");
            num = Integer.parseInt(entrada.readLine());
        }

        System.out.println("Acertaste!");
    }
}
