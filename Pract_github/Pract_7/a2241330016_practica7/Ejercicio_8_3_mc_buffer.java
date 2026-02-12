package a2241330016_practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio_8_3_mc_buffer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c;

        System.out.println("Ingrese lado 1:");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingrese lado 2:");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingrese lado 3:");
        c = Double.parseDouble(br.readLine());

        if (a == b) {
            if (b == c) {
                System.out.println("Es triangulo equilatero");
            } else {
                System.out.println("Es triangulo isosceles");
            }
        } else {
            if (a == c) {
                System.out.println("Es triangulo isosceles");
            } else {
                if (b == c) {
                    System.out.println("Es triangulo isosceles");
                } else {
                    System.out.println("Es triangulo escaleno");
                }
            }
        }
    }
}
