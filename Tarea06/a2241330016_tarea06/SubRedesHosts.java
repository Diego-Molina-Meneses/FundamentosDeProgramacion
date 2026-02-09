package a2241330016_tarea06;
import java.util.Scanner;
public class SubRedesHosts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bits de host (N): ");
        int N = sc.nextInt();

        int total = (int) Math.pow(2, N);

        int hosts;
        if (total >= 2) {
            hosts = total - 2;
        } else {
            hosts = 0;
        }

        System.out.println("Hosts disponibles: " + hosts);
    }
}
