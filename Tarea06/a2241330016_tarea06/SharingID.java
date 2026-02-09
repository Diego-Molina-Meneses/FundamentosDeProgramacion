package a2241330016_tarea06;
import java.util.Scanner;
public class SharingID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID: ");
        int ID = sc.nextInt();

        int r = ID % 3;

        if (r == 0) System.out.println("Servidor 0");
        if (r == 1) System.out.println("Servidor 1");
        if (r == 2) System.out.println("Servidor 2");
    }
}
