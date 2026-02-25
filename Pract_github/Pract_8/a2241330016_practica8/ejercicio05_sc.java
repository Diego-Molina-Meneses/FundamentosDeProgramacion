package a2241330016_practica8;
import java.util.Scanner;
public class ejercicio05_sc {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String producto1 = "coca cola light lata 400 mil";
        String producto2 = "coca cola lata 400 mil";

        int opc, cant1, cant2;
        double precio1 = 16;
        double precio2 = 15;
        double subtotal1, subtotal2, iva1, iva2, total1, total2;

        System.out.println("Menu de Opciones");
        System.out.println("1.- Productos");
        System.out.println("2.- Punto de venta");
        System.out.print("Que opcion deseas: ");
        opc = entrada.nextInt();

        switch (opc) {

            case 1:
                System.out.println("Elegiste la opcion de productos");
                System.out.println("El " + producto1 + " cuesta $" + precio1);
                System.out.println("El " + producto2 + " cuesta $" + precio2);
                break;

            case 2:
                System.out.print("Cantidad de " + producto1 + ": ");
                cant1 = entrada.nextInt();

                System.out.print("Cantidad de " + producto2 + ": ");
                cant2 = entrada.nextInt();

                subtotal1 = cant1 * precio1;
                iva1 = subtotal1 * 0.16;
                total1 = subtotal1 + iva1;

                subtotal2 = cant2 * precio2;
                iva2 = subtotal2 * 0.16;
                total2 = subtotal2 + iva2;

                System.out.println("\n--- Ticket ---");
                System.out.println(producto1 + " x" + cant1);
                System.out.println("Subtotal: " + subtotal1);
                System.out.println("IVA: " + iva1);
                System.out.println("Total: " + total1);

                System.out.println("\n" + producto2 + " x" + cant2);
                System.out.println("Subtotal: " + subtotal2);
                System.out.println("IVA: " + iva2);
                System.out.println("Total: " + total2);

                System.out.println("\nTOTAL GENERAL:");
                System.out.println("Subtotal: " + (subtotal1 + subtotal2));
                System.out.println("IVA: " + (iva1 + iva2));
                System.out.println("Total: " + (total1 + total2));
                break;

            default:
                System.out.println("Opcion incorrecta");
        }
    }
}

