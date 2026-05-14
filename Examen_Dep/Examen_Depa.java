package examen_depa;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Examen_Depa {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean NoEstaVacia(String texto) {
        if (texto == null) {
            return false;
        }

        if (texto.trim().equals("")) {
            return false;
        }

        return true;
    }

    public static boolean EsNumeroEnteroDeUnaODosCifras(String texto) {
        if (!NoEstaVacia(texto)) {
            return false;
        }

        texto = texto.trim();

        if (texto.length() < 1 || texto.length() > 2) {
            return false;
        }

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter < '0' || caracter > '9') {
                return false;
            }
        }

        return true;
    }

    public static boolean CalificacionValida(String texto) {
        if (!EsNumeroEnteroDeUnaODosCifras(texto)) {
            return false;
        }

        int calificacion = Integer.parseInt(texto);

        if (calificacion >= 1 && calificacion <= 100) {
            return true;
        }

        return false;
    }

    public static double PromedioAlumno(int[] filaAlumno) {
        int suma = 0;

        for (int i = 0; i < filaAlumno.length; i++) {
            suma = suma + filaAlumno[i];
        }

        return suma / 2.0;
    }

    public static double PromedioGeneral(int[][] calificaciones) {
        int suma = 0;
        int cantidad = 0;

        for (int filas = 0; filas < calificaciones.length; filas++) {
            for (int columnas = 0; columnas < calificaciones[filas].length; columnas++) {
                suma = suma + calificaciones[filas][columnas];
                cantidad++;
            }
        }

        return suma / (double) cantidad;
    }

    public static double PromedioAsignatura(int[][] calificaciones, int asignatura) {
        int suma = 0;

        for (int filas = 0; filas < calificaciones.length; filas++) {
            suma = suma + calificaciones[filas][asignatura];
        }

        return suma / (double) calificaciones.length;
    }

    public static String LeerDatoNoVacio(String mensaje) throws Exception {
        String dato = "";

        do {
            System.out.print(mensaje);
            dato = br.readLine();

            if (!NoEstaVacia(dato)) {
                System.out.println("Error: el dato no puede estar vacio.");
            }

        } while (!NoEstaVacia(dato));

        return dato.trim();
    }

    public static int LeerCalificacion(String mensaje) throws Exception {
        String dato = "";

        do {
            System.out.print(mensaje);
            dato = br.readLine();

            if (!CalificacionValida(dato)) {
                System.out.println("Error: la calificacion debe ser un numero entero de 1 a 100.");
            }

        } while (!CalificacionValida(dato));

        return Integer.parseInt(dato);
    }

    public static int LeerNumeroAlumnos() throws Exception {
        String dato = "";
        int numero = 0;

        do {
            System.out.print("Ingresa el numero de alumnos: ");
            dato = br.readLine();

            if (!NoEstaVacia(dato)) {
                System.out.println("Error: el numero de alumnos no puede estar vacio.");
            } else {
                try {
                    numero = Integer.parseInt(dato);

                    if (numero <= 0) {
                        System.out.println("Error: el numero de alumnos debe ser mayor que 0.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error: debes ingresar un numero entero.");
                    numero = 0;
                }
            }

        } while (numero <= 0);

        return numero;
    }

    public static void MostrarResultados(String[] nombres, int[][] calificaciones) {
        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("Alumno\t\tAsignatura 1\tAsignatura 2\tPromedio");

        for (int i = 0; i < nombres.length; i++) {
            double promedio = PromedioAlumno(calificaciones[i]);

            System.out.println(
                nombres[i] + "\t\t" +
                calificaciones[i][0] + "\t\t" +
                calificaciones[i][1] + "\t\t" +
                promedio
            );
        }

        System.out.println("\nPromedio general del grupo: " + PromedioGeneral(calificaciones));
        System.out.println("Promedio de asignatura 1: " + PromedioAsignatura(calificaciones, 0));
        System.out.println("Promedio de asignatura 2: " + PromedioAsignatura(calificaciones, 1));
    }

    public static void main(String[] args) throws Exception {

        int n = LeerNumeroAlumnos();

        String[] nombres = new String[n];
        int[][] calificaciones = new int[n][2];

        for (int filas = 0; filas < n; filas++) {
            System.out.println("\nAlumno " + (filas + 1));

            nombres[filas] = LeerDatoNoVacio("Ingresa el nombre del alumno: ");

            for (int columnas = 0; columnas < 2; columnas++) {
                calificaciones[filas][columnas] = LeerCalificacion(
                    "Ingresa la calificacion de la asignatura " + (columnas + 1) + ": "
                );
            }
        }

        MostrarResultados(nombres, calificaciones);
    }
}

