package a2241330016_tarea08;
import java.util.Scanner;
public class ClimaHumedad {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa temperatura: ");
        double temp = sc.nextDouble();
        System.out.print("Ingresa humedad: ");
        double hum = sc.nextDouble();

        if (temp > 30 && hum > 80) {
            System.out.println("Sofocante");
        } else if (temp < 15 && hum > 80) {
            System.out.println("Frio Humedo");
        } else {
            System.out.println("Normal");
        }
    }
}
