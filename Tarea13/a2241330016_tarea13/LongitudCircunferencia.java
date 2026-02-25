package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LongitudCircunferencia {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double r, l;  // longitud y radio

        System.out.print("Introduce el radio de una circunferencia: ");
        r = Double.parseDouble(entrada.readLine());

        l = 2 * Math.PI * r;

        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }
}
