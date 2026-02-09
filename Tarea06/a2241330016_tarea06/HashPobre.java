package a2241330016_tarea06;
import java.util.Scanner;
public class HashPobre {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero de 4 cifras: ");
        int N = sc.nextInt();

        int a = N / 1000;
        int b = (N / 100) % 10;
        int c = (N / 10) % 10;
        int d = N % 10;

        int checksum = a + b + c + d;

        System.out.println("Checksum: " + checksum);
    }
}
