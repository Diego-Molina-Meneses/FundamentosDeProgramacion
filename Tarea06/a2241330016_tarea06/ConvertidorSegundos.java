package a2241330016_tarea06;
import java.util.Scanner;
public class ConvertidorSegundos {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Segundos totales: ");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int resto = segundos - horas * 3600;

        int minutos = resto / 60;
        int segundosFinal = resto - minutos * 60;

        if (minutos >= 60) minutos = 59;
        if (segundosFinal >= 60) segundosFinal = 59;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosFinal);
    }
}
