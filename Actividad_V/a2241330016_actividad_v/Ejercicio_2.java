package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_2 {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double gasto, total;
        total = 0;

        System.out.println("Ingresa el gasto:");
        gasto = Double.parseDouble(br.readLine());

        if (gasto == 0) {
            System.out.println("No hubo gastos");
        }

        while (gasto != 0) {

            total = total + gasto;

            System.out.println("El total es:");
            System.out.println(total);

            System.out.println("Hay mas gastos? Ingresa la cantidad:");
            gasto = Double.parseDouble(br.readLine());

            if (gasto == 0) {
                System.out.println("Ya no hay gastos");
            }
        }

        System.out.println("El total es: " + total);
    }
}
