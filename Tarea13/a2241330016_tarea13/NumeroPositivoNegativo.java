package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NumeroPositivoNegativo {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int num;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(entrada.readLine());

        if (num < 0)
            System.out.println("Negativo");
        else
            System.out.println("Positivo");
    }
}
