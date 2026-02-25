package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CompararNumerosCompleto {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int n1, n2;

        System.out.print("Introduce un numero: ");
        n1 = Integer.parseInt(entrada.readLine());

        System.out.print("Introduce otro numero: ");
        n2 = Integer.parseInt(entrada.readLine());

        if (n1 == n2)
            System.out.println("Son iguales");
        else
            if (n1 > n2)
                System.out.println(n1 + " es mayor que " + n2);
            else
                System.out.println(n2 + " es mayor que " + n1);
    }
}
