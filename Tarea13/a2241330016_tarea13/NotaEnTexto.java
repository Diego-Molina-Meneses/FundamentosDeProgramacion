package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NotaEnTexto {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int nota;

        System.out.print("Introduzca una nota entre 0 y 10: ");
        nota = Integer.parseInt(entrada.readLine());

        switch (nota) {

            case 0: System.out.println("cero"); break;
            case 1: System.out.println("uno"); break;
            case 2: System.out.println("dos"); break;
            case 3: System.out.println("tres"); break;
            case 4: System.out.println("cuatro"); break;
            case 5: System.out.println("cinco"); break;
            case 6: System.out.println("seis"); break;
            case 7: System.out.println("siete"); break;
            case 8: System.out.println("ocho"); break;
            case 9: System.out.println("nueve"); break;
            case 10: System.out.println("diez"); break;

            default:
                System.out.println("Nota fuera de rango");
        }
    }
}
