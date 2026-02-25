package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DiferenciarFechas {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia1, mes1, ano1;
        int dia2, mes2, ano2;
        int total_dias;

        System.out.println("Fecha 1:");
        System.out.print("Introduzca dia: ");
        dia1 = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca mes: ");
        mes1 = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca ano: ");
        ano1 = Integer.parseInt(entrada.readLine());

        System.out.println("Fecha 2:");
        System.out.print("Introduzca dia: ");
        dia2 = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca mes: ");
        mes2 = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca ano: ");
        ano2 = Integer.parseInt(entrada.readLine());

        total_dias = dia2 - dia1 + 30 * (mes2 - mes1) + 365 * (ano2 - ano1);

        System.out.println("Dias de diferencia: " + total_dias);
    }
}
