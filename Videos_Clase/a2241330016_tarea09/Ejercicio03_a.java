package a2241330016_tarea09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ejercicio03_a {
    public static void main(String[] args) throws IOException {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        double dato;
        System.out.println("Introduzca un numero de 5 cifras: ");
        dato = Double.parseDouble(entrada.readLine());
        numero = (int) dato;
        if((numero < 100000) && (numero > 9999) && (numero == dato)) {
        System.out.println("Tiene 5 cifras");
        } else {
        System.out.println("Lo siento no tiene 5 cifras o no es entero.");
        }
    }
}
