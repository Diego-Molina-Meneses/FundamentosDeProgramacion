package a2241330016_productointegrador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Funciones_Procedimientos2 {
 //Es el mismo codigo solo que se le implemento Nuevos procedimientos como String Leer, String EsNumeroEntero,
 //String EsNumeroDouble, String EvaluarNumerico   
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public static String MostrarMenu(String[] opciones) {
        String menu = "";
        int i = 0;
 
        while (i < opciones.length) {
            menu = menu + (i + 1) + ".- " + opciones[i] + "\n";
            i++;
        }
 
        return menu;
    }
 
    public static String Dialogo(String texto) throws IOException {
        System.out.print(texto);
        return br.readLine();
    }
 
    public static String Leer(String texto) throws IOException {
        String cadena = "";
 
        cadena = Dialogo(texto);
 
        if (cadena != null) {
            cadena = cadena.trim();
 
            if (cadena.equals("")) {
                cadena = null;
            }
        }
 
        return cadena;
    }
 
    public static boolean EsNumeroEntero(String dato) {
        int i = 0;
        char ch;
 
        if (dato == null || dato.equals("")) {
            return false;
        }
 
        while (i < dato.length()) {
            ch = dato.charAt(i);
 
            if (!Character.isDigit(ch)) {
                return false;
            }
 
            i++;
        }
 
        return true;
    }
 
    public static boolean EsNumeroDouble(String dato) {
        int i = 0;
        char ch;
        boolean tienePunto = false;
 
        if (dato == null || dato.equals("")) {
            return false;
        }
 
        while (i < dato.length()) {
            ch = dato.charAt(i);
 
            if (Character.isDigit(ch)) {
                // válido
            } else if (ch == '.') {
                if (tienePunto) {
                    return false;
                }
                tienePunto = true;
            } else {
                return false;
            }
 
            i++;
        }
 
        return true;
    }
 
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
 
        switch (tipo) {
            case 1:
                if (EsNumeroEntero(dato)) {
                    valido = true;
                }
                break;
 
            case 2:
                if (EsNumeroDouble(dato)) {
                    valido = true;
                }
                break;
 
            default:
                valido = false;
                break;
        }
 
        return valido;
    }
 
    public static int DesplegarMenu(String titulo, String[] menu) throws IOException {
        String cadena;
        String opcionTexto;
        int opcion;
 
        do {
            cadena = titulo + "\n\n";
            cadena = cadena + MostrarMenu(menu);
            cadena = cadena + "\nQue opcion deseas: ";
 
            opcionTexto = Leer(cadena);
 
            if (EvaluarNumerico(opcionTexto, 1)) {
                opcion = Integer.parseInt(opcionTexto);
 
                if (opcion >= 1 && opcion <= menu.length) {
                    return opcion;
                } else {
                    System.out.println("\nOpcion fuera de rango.\n");
                }
            } else {
                System.out.println("\nDebes escribir un numero entero valido.\n");
            }
 
        } while (true);
    }
 
    public static void main(String[] args) throws IOException {
 
        String[] opciones = {
            "Productos",
            "Punto de venta",
            "Inventario",
            "Listado de Ventas",
            "Salida"
        };
 
        int opcion;
 
        opcion = DesplegarMenu("Menu de punto de Venta", opciones);
 
        System.out.println("Elegiste: " + opcion);
        System.out.println("Opcion seleccionada: " + opciones[opcion - 1]);
    }
}

