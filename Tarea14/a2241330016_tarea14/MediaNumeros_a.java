package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MediaNumeros_a {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int suma = 0;
        int elementos = 0;
        float media;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        for (; num >= 0; ) {

            suma += num;
            elementos++;

            System.out.print("Introduce otro numero: ");
            num = Integer.parseInt(entrada.readLine());
        }

        if (elementos == 0) {
            System.out.println("No es posible calcular la media.");
        } else {
            media = (float) suma / elementos;
            System.out.println("La media es: " + media);
        }
    }
}
