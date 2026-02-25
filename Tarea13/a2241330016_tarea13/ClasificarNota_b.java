package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ClasificarNota_b {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nota;

        System.out.print("Introduzca una nota: ");
        nota = Integer.parseInt(entrada.readLine());

        switch (nota) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;

            case 5:
                System.out.println("SUFICIENTE");
                break;

            case 6:
                System.out.println("BIEN");
                break;

            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;

            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;

            default:
                System.out.println("Nota fuera de rango");
        }
    }
}
