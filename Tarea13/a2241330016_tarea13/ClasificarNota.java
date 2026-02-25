package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ClasificarNota {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nota;

        System.out.print("Introduzca una nota: ");
        nota = Integer.parseInt(entrada.readLine());

        if (nota >= 0 && nota < 5)
            System.out.println("INSUFICIENTE");
        else if (nota == 5)
            System.out.println("SUFICIENTE");
        else if (nota == 6)
            System.out.println("BIEN");
        else if (nota >= 7 && nota <= 8)
            System.out.println("NOTABLE");
        else if (nota >= 9 && nota <= 10)
            System.out.println("SOBRESALIENTE");
    }
}
