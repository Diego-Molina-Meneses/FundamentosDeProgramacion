package a2241330016_tarea05;
import java.util.Scanner;
public class EscalaMapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Centimetros en el mapa: ");
        double C = sc.nextDouble();

        double metros = C * 500;
        double km = metros / 1000;

        System.out.println("Distancia real en km: " + km);
    }
}
