package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DescomponerNumero {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int dm, um, c, d, u;

        System.out.print("Introduzca un numero entre 0 y 99,999: ");
        num = Integer.parseInt(entrada.readLine());

        // unidad
        u = num % 10;
        num = num / 10;

        // decenas
        d = num % 10;
        num = num / 10;

        // centenas
        c = num % 10;
        num = num / 10;

        // unidades de millar
        um = num % 10;
        num = num / 10;

        // decenas de millar
        dm = num;

        System.out.println("dm = " + dm);
        System.out.println("um = " + um);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("u = " + u);
    }
}
