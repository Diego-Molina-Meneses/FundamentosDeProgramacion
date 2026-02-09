package a2241330016_tarea05;
import java.util.Scanner;
public class Bisiestos_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ano final: ");
        int Y = sc.nextInt();

        int bisiestos = Y / 4;

        System.out.println("Anos bisiestos: " + bisiestos);

    }
}
