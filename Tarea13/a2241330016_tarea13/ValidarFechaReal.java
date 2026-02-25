package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ValidarFechaReal {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia, mes, ano;

        System.out.print("Introduzca dia: ");
        dia = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca mes: ");
        mes = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca ano: ");
        ano = Integer.parseInt(entrada.readLine());

        // en este codigo dice que no existe el 0
        if (ano == 0) {
            System.out.println("Fecha incorrecta");
        } else {

            if (mes == 2 && (dia >= 1 && dia <= 28)) {
                System.out.println(dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    && (dia >= 1 && dia <= 30)) {
                System.out.println(dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)
                    && (dia >= 1 && dia <= 31)) {
                System.out.println(dia + "/" + mes + "/" + ano + ": Fecha correcta");
            } else {
                System.out.println("Fecha incorrecta");
            }
        }
    }
}
