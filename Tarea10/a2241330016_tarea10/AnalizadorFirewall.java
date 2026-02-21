package a2241330016_tarea10;
import java.util.Scanner;
public class AnalizadorFirewall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo (1=Permitir, 2=Bloquear, 3=Cuarentena): ");
        int codigo = sc.nextInt();

        System.out.print("Nivel de riesgo (1-10): ");
        int nivel = sc.nextInt();

        switch (codigo) {
            case 1:
                if (nivel > 7) {
                    System.out.println("Advertencia: Trafico riesgoso permitido");
                } else {
                    System.out.println("Trafico seguro");
                }
                break;
            case 2:
                System.out.println("Paquete descartado");
                break;
            case 3:
                System.out.println("Paquete aislado para analisis");
                break;
            default:
                System.out.println("Codigo invalido");
        }
    }
}
