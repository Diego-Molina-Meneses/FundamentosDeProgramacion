package a2241330016_tarea09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio02_a {
    public static void main(String[] args) throws IOException {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        System.out.println("Introduzca un numero de 5 cifras: ");
        numero = Integer.parseInt(entrada.readLine());

        if(numero > 10000 && numero > 9999) {
        System.out.println("Tiene 5 cifras");
        } else {
        System.out.println("No tiene 5 cifras.");
        }
    }
}
