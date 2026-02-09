package a2241330016_tarea06;
import java.util.Scanner;
public class Invertir2Cifras {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Numero de dos cifras: ");
        int N = sc.nextInt();

        int D = N / 10;
        int U = N % 10;

        int invertido = U * 10 + D;

        System.out.println("Numero invertido: " + invertido);     
    }
}
