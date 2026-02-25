package a2241330016_tarea13;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ValidarFecha {
     public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int dia, mes, ano;

        System.out.print("Introduzca dia: ");
        dia = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca mes: ");
        mes = Integer.parseInt(entrada.readLine());

        System.out.print("Introduzca ano: ");
        ano = Integer.parseInt(entrada.readLine());

        if (dia >= 1 && dia <= 30) {

            if (mes >= 1 && mes <= 12) {

                if (ano >= 0)
                    System.out.println("Fecha correcta");
                else
                    System.out.println("Ano incorrecto");

            } else
                System.out.println("Mes incorrecto");

        } else
            System.out.println("Dia incorrecto");
    }
}
