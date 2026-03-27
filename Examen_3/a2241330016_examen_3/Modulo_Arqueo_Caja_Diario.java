package a2241330016_examen_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Modulo_Arqueo_Caja_Diario {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int opcion;
        double fondoInicial, totalVentas, totalGastos, efectivoReal;

        fondoInicial = 0;
        totalVentas = 0;
        totalGastos = 0;
        efectivoReal = 0;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    fondoInicial = leerNumeroValidado("Ingrese el fondo de caja inicial: ");
                    break;

                case 2:
                    totalVentas = registrarMovimientos("ventas");
                    break;

                case 3:
                    totalGastos = registrarMovimientos("gastos");
                    break;

                case 4:
                    efectivoReal = leerNumeroValidado("Ingrese el efectivo real en cajon: ");
                    calcularCorte(fondoInicial, totalVentas, totalGastos, efectivoReal);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 5);
    }

    public static int mostrarMenu() throws IOException {
        String texto;
        int opcion;

        System.out.println("=== SISTEMA DE ARQUEO DE CAJA ===");
        System.out.println("1. Ingresar Fondo de Caja Inicial");
        System.out.println("2. Registrar Ventas del Turno");
        System.out.println("3. Registrar Gastos / Retiros");
        System.out.println("4. Realizar Corte de Caja (Resultado Final)");
        System.out.println("5. Salir del Sistema");

        do {
            System.out.print("Seleccione una opcion: ");
            texto = br.readLine();

            if (validarEntero(texto)) {
                opcion = Integer.parseInt(texto);
            } else {
                System.out.println("Error: debe capturar un numero entero.");
                opcion = 0;
            }
        } while (!validarEntero(texto));

        return opcion;
    }

    public static boolean validarNumero(String texto) {
        int i;
        int puntos = 0;
        char caracter;

        if (texto == null || texto.length() == 0) {
            return false;
        }

        for (i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            if (caracter == '.') {
                puntos++;
                if (puntos > 1) {
                    return false;
                }
            } else if (caracter < '0' || caracter > '9') {
                return false;
            }
        }

        return true;
    }

    public static boolean validarEntero(String texto) {
        int i;
        char caracter;

        if (texto == null || texto.length() == 0) {
            return false;
        }

        for (i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);

            if (caracter < '0' || caracter > '9') {
                return false;
            }
        }

        return true;
    }

    public static double leerNumeroValidado(String mensaje) throws IOException {
        String texto;
        double numero;

        do {
            System.out.print(mensaje);
            texto = br.readLine();

            if (validarNumero(texto)) {
                numero = Double.parseDouble(texto);
                return numero;
            } else {
                System.out.println("Entrada invalida. Solo se permiten numeros.");
            }
        } while (true);
    }

    public static double registrarMovimientos(String tipoMovimiento) throws IOException {
        String textoCantidad;
        int cantidad, i;
        double monto;
        double total = 0;

        do {
            System.out.print("Cuantos movimientos de " + tipoMovimiento + " desea registrar?: ");
            textoCantidad = br.readLine();

            if (validarEntero(textoCantidad)) {
                cantidad = Integer.parseInt(textoCantidad);

                if (cantidad >= 0) {
                    for (i = 1; i <= cantidad; i++) {
                        monto = leerNumeroValidado("Ingrese el monto del movimiento " + i + ": ");
                        total = total + monto;
                    }
                    return total;
                } else {
                    System.out.println("La cantidad no puede ser negativa.");
                }
            } else {
                System.out.println("Error: capture una cantidad valida.");
            }
        } while (true);
    }

    public static void calcularCorte(double fondoInicial, double totalVentas, double totalGastos, double efectivoReal) {
        double esperado, diferencia;

        esperado = (fondoInicial + totalVentas) - totalGastos;
        diferencia = efectivoReal - esperado;

        System.out.println("===== RESULTADO DEL CORTE =====");
        System.out.println("Fondo inicial: " + fondoInicial);
        System.out.println("Total ventas: " + totalVentas);
        System.out.println("Total gastos: " + totalGastos);
        System.out.println("Efectivo esperado: " + esperado);
        System.out.println("Efectivo real: " + efectivoReal);

        if (diferencia == 0) {
            System.out.println("El corte esta CUADRADO.");
        } else if (diferencia > 0) {
            System.out.println("Hay un SOBRANTE de: " + diferencia);
        } else {
            System.out.println("Hay un FALTANTE de: " + (diferencia * -1));
        }
    }
}
