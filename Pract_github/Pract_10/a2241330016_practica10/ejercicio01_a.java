package a2241330016_practica10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ejercicio01_a {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularareatriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void mostrarmenu() {
        System.out.println("Menu:");
        System.out.println("c.- Calcular area del circulo");
        System.out.println("t.- Calcular area del triangulo");
        System.out.println("s.- salir");
        System.out.print("Elige una opcion: ");
    }
    
    public static void circulo() throws IOException{
        double radio = pedirdato("Ingresa el radio del circulo: ");
        System.out.println("El area del circulo es: " + calcularareacirculo(radio));
    }
    
    public static void triangulo() throws IOException{
        double base = pedirdato("Ingresa la base del triangulo: ");
        double altura = pedirdato("Ingresa la altura del triangulo: ");
        System.out.println("El area del triangulo es: " + calcularareatriangulo(base, altura));
    }
    
    public static void main(String[] args)throws IOException {
         String opcion;
        double radio;

    do {
        mostrarmenu();
        opcion = lectura.readLine().toUpperCase();

        switch (opcion)
        {
            case "C":
                circulo();
                break;

            case "T":
                triangulo();
                break;

            case "S":
                System.out.println("Saliendo del programa.");
                break;

            default:
                System.out.println("Opción inválida.");
            }

        } while (!(opcion.equals("S") || opcion.equals("s")));
    }
}
