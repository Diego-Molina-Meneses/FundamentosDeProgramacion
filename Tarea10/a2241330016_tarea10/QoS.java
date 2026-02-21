package a2241330016_tarea10;
import java.util.Scanner;
public class QoS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de trafico (V=Voz, D=Datos, G=Gaming): ");
        char tipo = sc.next().charAt(0);

        switch (Character.toUpperCase(tipo)) {
            case 'D':
                System.out.print("Tamaño del trafico en MB: ");
                double tamMB = sc.nextDouble();

                if (tamMB > 1000) {
                    System.out.println("Prioridad: Baja");
                } else {
                    System.out.println("Prioridad: Media");
                }
                break;

            case 'V':
                System.out.println("Prioridad: Critica");
                break;

            case 'G':
                System.out.println("Prioridad: Alta");
                break;

            default:
                System.out.println("Tipo de trafico no valido");
        }
    }
}
