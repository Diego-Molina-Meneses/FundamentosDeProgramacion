package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExisteSuspenso_a {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nota;
        boolean suspenso = false;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce nota (0 a 10): ");
            nota = Integer.parseInt(entrada.readLine());

            if (nota < 5) {
                suspenso = true;
            }
        }

        if (suspenso) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay suspensos");
        }
    }
}
