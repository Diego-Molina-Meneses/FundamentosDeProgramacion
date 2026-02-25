package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CantidadCifras {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.print("Introduzca un numero entre 0 y 99,999: ");
        num = Integer.parseInt(entrada.readLine());

        if (num < 10)
            System.out.println("Tiene 1 cifra");
        else if (num < 100)
            System.out.println("Tiene 2 cifras");
        else if (num < 1000)
            System.out.println("Tiene 3 cifras");
        else if (num < 10000)
            System.out.println("Tiene 4 cifras");
        else if (num < 100000)
            System.out.println("Tiene 5 cifras");
    }
}
