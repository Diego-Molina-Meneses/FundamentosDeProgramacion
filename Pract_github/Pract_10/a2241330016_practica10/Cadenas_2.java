package a2241330016_practica10;

public class Cadenas_2 {

        public static void main(String[] args) {
        String cadena = " 1973 Perdoname si no te sigo pero me Aburre caminar me Construi unas alas de carton y voy a intentar llegar al sol aunque me muera de calor...";

        // Llamada a los métodos
        contarLetrasYDigitos(cadena);
        contarMayusculasYMinusculas(cadena);
        imprimirEnMayusculas(cadena);
        imprimirEnMinusculas(cadena);
    }

    // Método para contar letras y dígitos
        public static void contarLetrasYDigitos(String texto) {
        int car = 0, dig = 0;
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (Character.isLetter(ch)) {
                car++;
            } else if (Character.isDigit(ch)) {
                dig++;
            }
        }
        System.out.println("el numero de letras es " + car);
        System.out.println("el numero de numeros es " + dig);
    }

    // Método para contar mayúsculas y minúsculas
        public static void contarMayusculasYMinusculas(String texto) {
        int may = 0, min = 0;
        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (Character.isLowerCase(ch)) {
                min++;
            } else if (Character.isUpperCase(ch)) {
                may++;
            }
        }
        System.out.println("el numero de minusculas es " + min);
        System.out.println("el numero de mayusculas es " + may);
    }

    // Método para imprimir todo en mayúsculas
        public static void imprimirEnMayusculas(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(Character.toUpperCase(texto.charAt(i)));
        }
        System.out.println(); // Salto de línea al terminar
    }

    // Método para imprimir todo en minúsculas
        public static void imprimirEnMinusculas(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(Character.toLowerCase(texto.charAt(i)));
        }
        System.out.println();
    }
}

