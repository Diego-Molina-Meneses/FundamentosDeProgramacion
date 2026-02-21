package a2241330016_tarea10;
import java.util.Scanner;
public class DetectorExtensiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo de extension (1=.exe, 2=.docx, 3=.sh): ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1: // .exe
            case 3: // .sh
                System.out.print("¿Tiene permisos de admin? (1=Si, 0=No): ");
                int adminNum = sc.nextInt();
                boolean esAdmin = (adminNum == 1);

                System.out.println("Archivo potencialmente ejecutable. ¿Tiene permisos de admin?");
                if (esAdmin) {
                    System.out.println("ALERTA: Ejecutable con permisos de admin");
                } else {
                    System.out.println("Ejecutable detectado sin permisos de admin");
                }
                break;

            case 2: // .docx
                System.out.println("Documento de texto seguro");
                break;

            default:
                System.out.println("Extension no reconocida");
        }
    }
}
