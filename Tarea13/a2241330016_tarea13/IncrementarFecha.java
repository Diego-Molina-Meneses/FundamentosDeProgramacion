package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IncrementarFecha {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia, mes, ano;

        System.out.print("Introduzca dia: ");
        dia = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca mes: ");
        mes = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca ano: ");
        ano = Integer.parseInt(entrada.readLine());

        // incrementamos el dia
        dia++;

        if (dia > 30) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                ano++;
            }
        }

        if (ano == 0)
            ano = 1;

        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
