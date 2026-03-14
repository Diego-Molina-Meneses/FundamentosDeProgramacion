package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double numero = 0;
        double cubo = 0;

        System.out.println("Ingresa el numero natural:");
        numero = Double.parseDouble(br.readLine());

        if (numero < 0 || numero > 9) {
            System.out.println("El numero no es natural");
        }

        while (numero >= 0 && numero <= 9) {

            cubo = Math.pow(numero, 3);

            System.out.println("El cubo del numero es:");
            System.out.println(cubo);

            System.out.println("Ingresa otro numero natural:");
            numero = Double.parseDouble(br.readLine());

            if (numero < 0 || numero > 9) {
                System.out.println("El numero no es natural");
            }
        }
    }
}
