package a2241330016_tarea10;
import java.util.Scanner;
public class SelectorProtocolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese numero de puerto: ");
        int puerto = sc.nextInt();

        switch (puerto) {
            case 21:
                System.out.println("FTP - Transferencia de archivos");
                break;
            case 22:
                System.out.println("SSH - Acceso remoto seguro");
                break;
            case 25:
                System.out.println("SMTP - Envio de correo");
                break;
            case 80:
            case 443:
                System.out.println("Web (HTTP/HTTPS)");
                break;
            default:
                System.out.println("Puerto no estandar o desconocido");
        }
    }
}
