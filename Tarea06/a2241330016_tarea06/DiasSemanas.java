package a2241330016_tarea06;
import java.util.Scanner;
public class DiasSemanas {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de dias: ");
        int X = sc.nextInt();

        int semanas = X / 7;
        int resto = X % 7;

        if (semanas == 1) {
            System.out.println(semanas + " semana y " + resto + " dias");
        } else {
            System.out.println(semanas + " semanas y " + resto + " dias");
        }
    }
}
