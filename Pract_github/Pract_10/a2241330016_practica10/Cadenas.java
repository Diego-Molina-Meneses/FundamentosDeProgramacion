package a2241330016_practica10;

public class Cadenas {
    public static void main(String[] args) {

        String cadena, cadena2;

        cadena = "nunca me digas que no puedo nunca me digas que creer no ves que tengo miedo no me pongas tus cadenas";

        mostrarLongitud(cadena);

        cadena = convertirMayusculas(cadena);
        imprimir(cadena);

        cadena = convertirMinusculas(cadena);
        imprimir(cadena);

        cadena2 = "perdoname si no te sigo pero me aburre caminar me construi unas alas de carton y voy a intentar llegar a sol aunque me muera de calor...";

        cadena = concatenar(cadena, cadena2);
        imprimir(cadena);

        cadena2 = subcadena(cadena);
        imprimir(cadena2);
        imprimir(cadena);

        imprimirPorLinea(cadena);

        imprimirEspaciosComoSalto(cadena);

        contarVocalA(cadena);
    }

    // Método para mostrar longitud
    public static void mostrarLongitud(String cadena) {
        System.out.println("la cadena tiene una cantidad de caracteres " + cadena.length());
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Concatenar cadenas
    public static String concatenar(String c1, String c2) {
        return c1.concat(c2);
    }

    // Obtener subcadena
    public static String subcadena(String cadena) {
        return cadena.substring(10);
    }

    // Imprimir cadena
    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }

    // Imprimir carácter por línea
    public static void imprimirPorLinea(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }

    // Imprimir con salto en espacios
    public static void imprimirEspaciosComoSalto(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ')
                System.out.println("");
            else
                System.out.print(cadena.charAt(i));
        }
    }

    // Contar vocales 'a'
    public static void contarVocalA(String cadena) {
        int vocal = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                vocal++;
            }
        }

        System.out.println("\nexisten " + vocal + " vocales a en la cadena");
    }
}
