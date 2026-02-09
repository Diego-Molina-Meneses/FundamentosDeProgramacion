package a2241330016_tarea05;
import java.util.Scanner;
public class EliminacionExtrem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Ingresa un numero de 4 cifras: ");
        int n = sc.nextInt();

        int centrales = (n / 10) % 100;

        System.out.println("Las dos cifras centrales son: " + centrales);
        
    }
}
