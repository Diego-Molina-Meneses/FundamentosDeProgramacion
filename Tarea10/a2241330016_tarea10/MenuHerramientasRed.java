package a2241330016_tarea10;
import java.util.Scanner;
public class MenuHerramientasRed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU HERRAMIENTAS DE RED ===");
        System.out.println("1. Escanear Red");
        System.out.println("2. Verificar Firewall");
        System.out.println("3. Cifrar Mensaje");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion (1-4): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un rango (ej. > 0): ");
                int rango = sc.nextInt();
                if (rango > 0) {
                    System.out.println("Escaneando red en rango: " + rango);
                } else {
                    System.out.println("Rango invalido");
                }
                break;

            case 2:
                System.out.println("Estado: Activo");
                break;

            case 3:
                System.out.print("Nivel (1 o 2): ");
                int nivel = sc.nextInt();
                if (nivel == 2) {
                    System.out.println("Cifrado AES");
                } else if (nivel == 1) {
                    System.out.println("Cifrado Cesar");
                } else {
                    System.out.println("Nivel invalido");
                }
                break;

            case 4:
                System.out.println("Cerrando sesion");
                break;

            default:
                System.out.println("Opcion invalida");
        }
    }
}
