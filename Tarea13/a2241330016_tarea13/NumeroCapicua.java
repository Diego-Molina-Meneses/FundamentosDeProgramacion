package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroCapicua {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int dm, um, c, d, u;

        System.out.print("Introduzca un numero entre 0 y 99,999: ");
        num = Integer.parseInt(entrada.readLine());

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        if (dm == u && um == d)
            System.out.println("El numero es capicua");
        else
            System.out.println("El numero NO es capicua");
    }
}
