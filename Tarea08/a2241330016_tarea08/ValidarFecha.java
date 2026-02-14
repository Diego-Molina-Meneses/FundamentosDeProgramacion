package a2241330016_tarea08;
import java.util.Scanner;
public class ValidarFecha {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Es bisiesto? (true/false): ");
        boolean bisiesto = sc.nextBoolean();

        boolean valida = false;

        if (mes >= 1 && mes <= 12 && dia >= 1) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                valida = (dia <= 31);
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                valida = (dia <= 30);
            } else { // febrero
                if (bisiesto) valida = (dia <= 29);
                else valida = (dia <= 28);
            }
        }

        if (valida) System.out.println("Fecha Valida");
        else System.out.println("Fecha Invalida");
    }
}
