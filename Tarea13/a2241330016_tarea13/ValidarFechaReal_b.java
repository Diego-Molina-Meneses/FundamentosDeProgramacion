package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ValidarFechaReal_b {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia, mes, ano;
        int dias_del_mes;
        boolean fecha_correcta = true;

        System.out.print("Introduzca dia: ");
        dia = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca mes: ");
        mes = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca ano: ");
        ano = Integer.parseInt(entrada.readLine());

        dias_del_mes = 0; // si se utiliza un mes fuera del rango 1..12

        // en este codigo dice que no existe el 0
        if (ano == 0)
            fecha_correcta = false;

        // un dia fuera del rango 1..31 no tiene sentido
        if (dia < 1 || dia > 31)
            fecha_correcta = false;

        // un mes fuera del rango 1..12 no tiene sentido
        if (mes < 1 || mes > 12)
            fecha_correcta = false;

        // calcular dias del mes
        if (mes == 2)
            dias_del_mes = 28;
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            dias_del_mes = 30;
        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
            dias_del_mes = 31;

        if (dia > dias_del_mes)
            fecha_correcta = false;

        if (fecha_correcta)
            System.out.println(dia + "/" + mes + "/" + ano + ": Fecha correcta");
        else
            System.out.println("Fecha incorrecta");
    }
}
