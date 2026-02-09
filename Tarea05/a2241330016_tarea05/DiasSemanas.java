package a2241330016_tarea05;
import java.util.Scanner;
public class DiasSemanas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de dias: ");
        int X = sc.nextInt();

        int semanas = X / 7;
        int diasRestantes = X % 7;

        System.out.println("Semanas: " + semanas);
        System.out.println("Dias restantes: " + diasRestantes);
    }
}
