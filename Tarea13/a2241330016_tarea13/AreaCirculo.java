package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AreaCirculo {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        double r, a;  // area y radio

        System.out.print("Introduce el radio de un circulo: ");
        r = Double.parseDouble(entrada.readLine());

        a = Math.PI * (r * r);  // otra opción: Math.pow(r, 2)

        System.out.println("El area de una circunferencia de radio " + r + " es: " + a);
        
    }
}
