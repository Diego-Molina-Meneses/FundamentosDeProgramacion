package a2241330016_productointegrador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Funciones_Procedimientos3 {
 //Es el mismo codigo solo que agregando una funcion para la fecha, otra para Menu principal
 //para menu productos, para menu punto venta, para menu inventario, y una reestructuracion de menu punto venta
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
 
    public static String obtenerFecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(fecha);
    }
 
    public static String IdTicketSiguiente(String idticket) {
        int numero;
 
        numero = Integer.parseInt(idticket);
        numero++;
 
        if (numero < 10) {
            return "00" + numero;
        } else if (numero < 100) {
            return "0" + numero;
        } else {
            return String.valueOf(numero);
        }
    }
 
    public static void MenuPrincipal() throws IOException {
        String[] opciones = {
            "Productos",
            "Punto de venta",
            "Inventario",
            "Listado de Ventas",
            "Salida"
        };
 
        int opcion;
        String idticket = "000";
 
        do {
            opcion = DesplegarMenu("MENU PRINCIPAL", opciones);
 
            switch (opcion) {
                case 1:
                    MenuProductos();
                    break;
 
                case 2:
                    idticket = MenuPuntoVenta(idticket);
                    break;
 
                case 3:
                    MenuInventario();
                    break;
 
                case 4:
                    System.out.println("Listado de Ventas");
                    break;
 
                case 5:
                    System.out.println("Salida del Sistema");
                    break;
            }
 
        } while (opcion != 5);
    }
 
    public static void MenuProductos() throws IOException {
        String[] opciones = {
            "Modificar",
            "Listado",
            "Salida"
        };
 
        int opcion;
 
        do {
            opcion = DesplegarMenu("MENU PRODUCTOS", opciones);
 
            switch (opcion) {
                case 1:
                    System.out.println("Modificar Precio Producto");
                    break;
 
                case 2:
                    System.out.println("Listado Producto");
                    break;
 
                case 3:
                    System.out.println("Salida del Menu Productos");
                    break;
            }
 
        } while (opcion != 3);
    }
 
    public static String MenuPuntoVenta(String idticket) throws IOException {
        String[] opciones = {
            "Agregar Articulo",
            "Eliminar Articulo",
            "Listado de Articulos",
            "Pagar Ticket",
            "Salir"
        };
 
        int opcion;
        boolean pago = false;
        String fechadia;
        String membrete;
 
        idticket = IdTicketSiguiente(idticket);
        fechadia = obtenerFecha();
 
        membrete = "Fecha: " + fechadia + "\n";
        membrete = membrete + "Ticket: " + idticket + "\n";
        membrete = membrete + "----------------------";
 
        do {
            opcion = DesplegarMenu(membrete + "\nMENU PUNTO DE VENTA", opciones);
 
            switch (opcion) {
                case 1:
                    System.out.println("Agregar Articulo al Ticket");
                    break;
 
                case 2:
                    System.out.println("Eliminar Articulo del Ticket");
                    break;
 
                case 3:
                    System.out.println("Listado de Articulos del Ticket");
                    break;
 
                case 4:
                    System.out.println("Pagar Ticket y salir");
                    pago = true;
                    opcion = 5;
                    break;
 
                case 5:
                    System.out.println("Salida de Ventas");
 
                    if (!pago) {
                        System.out.println("El ticket no se pago, sera eliminado");
                    }
                    break;
            }
 
        } while (opcion != 5);
 
        return idticket;
    }
 
    public static void MenuInventario() throws IOException {
        String[] opciones = {
            "Listado de Inventario",
            "Agregar Inventario",
            "Salida"
        };
 
        int opcion;
 
        do {
            opcion = DesplegarMenu("MENU INVENTARIO", opciones);
 
            switch (opcion) {
                case 1:
                    System.out.println("Listado de Inventario");
                    break;
 
                case 2:
                    System.out.println("Agregar Inventario");
                    break;
 
                case 3:
                    System.out.println("Salida del Menu Inventario");
                    break;
            }
 
        } while (opcion != 3);
    }
 
    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}

