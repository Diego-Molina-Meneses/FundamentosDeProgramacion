package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroCapicuaCompleto {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int dm, um, c, d, u;
        boolean capicua = false;

        System.out.print("Introduzca un numero entre 0 y 99,999: ");
        num = Integer.parseInt(entrada.readLine());

        u = num % 10; num = num / 10;
        d = num % 10; num = num / 10;
        c = num % 10; num = num / 10;
        um = num % 10; num = num / 10;
        dm = num;

        if (dm != 0 && dm == u && um == d)
            capicua = true;

        if (dm == 0 && um != 0 && um == u && c == d)
            capicua = true;

        if (dm == 0 && um == 0 && c != 0 && c == u)
            capicua = true;

        if (dm == 0 && um == 0 && c == 0 && d != 0 && d == u)
            capicua = true;

        if (capicua)
            System.out.println("El numero es capicua");
        else
            System.out.println("El numero NO es capicua");
    }
}
