package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OrdenarTresNumeros {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;

        System.out.print("Introduzca primer numero: ");
        a = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca segundo numero: ");
        b = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca tercer numero: ");
        c = Integer.parseInt(entrada.readLine());

        if (a > b && b > c)
            System.out.println(a + ", " + b + ", " + c);
        else if (a > c && c > b)
            System.out.println(a + ", " + c + ", " + b);
        else if (b > a && a > c)
            System.out.println(b + ", " + a + ", " + c);
        else if (b > c && c > a)
            System.out.println(b + ", " + c + ", " + a);
        else if (c > a && a > b)
            System.out.println(c + ", " + a + ", " + b);
        else
            System.out.println(c + ", " + b + ", " + a);
    }
}
