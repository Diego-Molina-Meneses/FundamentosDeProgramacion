package a2241330016_tarea08;
import java.util.Scanner;
public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingresa un numero de 4 cifras: ");
        int num = sc.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        if (d1 == d4 && d2 == d3) {
            System.out.println("Es Capicua");
        } else {
            System.out.println("No lo es");
        }
    }
}
