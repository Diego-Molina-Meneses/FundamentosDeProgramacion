package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_5 {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;

        while (opcion != 2) {

            System.out.println("¿Deseas continuar?");
            System.out.println("(1) Si  (2) No");

            opcion = Integer.parseInt(br.readLine());
        }
    }
}
