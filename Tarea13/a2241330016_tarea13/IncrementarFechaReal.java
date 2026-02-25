package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IncrementarFechaReal {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia, mes, ano;
        int dias_del_mes = 0;

        System.out.print("Introduzca dia: ");
        dia = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca mes: ");
        mes = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca ano: ");
        ano = Integer.parseInt(entrada.readLine());

        if (mes == 2)
            dias_del_mes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;
        else
            dias_del_mes = 31;

        dia++;

        if (dia > dias_del_mes) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            ano++;
        }

        if (ano == 0)
            ano = 1;

        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
