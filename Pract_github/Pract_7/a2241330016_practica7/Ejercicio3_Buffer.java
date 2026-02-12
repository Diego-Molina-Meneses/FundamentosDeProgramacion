package a2241330016_practica7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio3_Buffer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.println("Introduce un numero:");
        num = Integer.parseInt(br.readLine());

        if ((num > 0) && (num % 2 == 0)) {
            System.out.println("Es positivo y par");
        }

        if ((num > 0) && (num % 2 > 0)) {
            System.out.println("Es positivo y impar");
        }

        if ((num < 0) && (num % 2 == 0)) {
            System.out.println("Es negativo y par");
        }

        if ((num < 0) && (num % 2 != 0)) {
            System.out.println("Es negativo y impar");
        }
    }
}
