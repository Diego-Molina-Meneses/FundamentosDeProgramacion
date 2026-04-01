package a2241330016_actividad_v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Actividad_clase {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Dialogo
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + ": ");
        cadena = br.readLine();
        return cadena;
    }

    // MostrarMenu
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;

        while (i < opciones.length) {
            cadena = cadena + (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }

        return cadena;
    }

    // DesplegarMenu
    public static String DesplegarMenu(String titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = titulo1 + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\nElija una opcion";
        return Dialogo(cadena);
    }

    // Leer
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);

        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.equals("")) {
                cadena = null;
            }
        } else {
            cadena = null;
        }

        return cadena;
    }

    // EsNumeroEntero
    public static boolean EsNumeroEntero(String dato) {
        int i;

        if (dato == null || dato.equals("")) {
            return false;
        }

        for (i = 0; i < dato.length(); i++) {
            if (!Character.isDigit(dato.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    // EsNumeroDouble
    public static boolean EsNumeroDouble(String dato) {
        boolean valido = false;
        int i;
        char c;

        if (dato == null || dato.equals("")) {
            return false;
        }

        for (i = 0; i < dato.length(); i++) {
            c = dato.charAt(i);

            if (Character.isDigit(c)) {
                // todo bien
            } else if (c == '.') {
                if (valido == false) {
                    valido = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return valido;
    }

    // EvaluarNumerico
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valida = false;

        switch (tipo) {
            case 1:
                if (EsNumeroEntero(dato)) {
                    valida = true;
                }
                break;

            case 2:
                if (EsNumeroDouble(dato)) {
                    valida = true;
                }
                break;
        }

        return valida;
    }

    // RellenarEspacios
    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        int i;

        for (i = dato.length(); i < tamano; i++) {
            cadena = cadena + " ";
        }

        return cadena;
    }

    // ObtenerUltimaPosicion
    public static int ObtenerUltimaPosicion(String[][] datos) {
        int ultimaPosicion = -1;
        int i;

        for (i = 0; i < datos.length; i++) {
            if (datos[i][0] != null && !datos[i][0].equals("")) {
                ultimaPosicion = i;
            }
        }

        return ultimaPosicion;
    }

    public static void main(String[] args) throws IOException {
        String[] opciones = {"Alta", "Baja", "Consulta", "Modificar", "Salir"};
        String respuesta;
        String dato;
        String[][] matriz = new String[5][2];

        respuesta = DesplegarMenu("MENU PRINCIPAL", opciones);
        System.out.println("\nOpcion elegida: " + respuesta);

        dato = Leer("Escribe un numero entero");
        System.out.println("Dato leido: " + dato);
        System.out.println("Es entero: " + EsNumeroEntero(dato));
        System.out.println("Es double: " + EsNumeroDouble(dato));
        System.out.println("EvaluarNumerico tipo 1: " + EvaluarNumerico(dato, 1));
        System.out.println("EvaluarNumerico tipo 2: " + EvaluarNumerico(dato, 2));

        System.out.println("\nTexto rellenado:");
        System.out.println("'" + RellenarEspacios("Hola", 10) + "'");

        matriz[0][0] = "Juan";
        matriz[1][0] = "Maria";
        matriz[2][0] = "";
        matriz[3][0] = "Pedro";
        matriz[4][0] = "";

        System.out.println("\nUltima posicion ocupada: " + ObtenerUltimaPosicion(matriz));
    }
}

