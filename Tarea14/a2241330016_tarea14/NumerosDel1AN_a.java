package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumerosDel1AN_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n;

        System.out.print("Introduce un numero: ");
        n = Integer.parseInt(entrada.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
