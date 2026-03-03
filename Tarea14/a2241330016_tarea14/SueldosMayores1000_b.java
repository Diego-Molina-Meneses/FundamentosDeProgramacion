package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class SueldosMayores1000_b {
    public static void main(String[] args) {

        int sueldo;
        int suma = 0;
        int mayor_1000 = 0;
        int i = 1;

        while (i <= 10) {

            sueldo = Integer.parseInt(
                    JOptionPane.showInputDialog("Escribe un sueldo:")
            );

            suma += sueldo;

            if (sueldo > 1000) {
                mayor_1000++;
            }

            i++;
        }

        String resultado = "Mayores de 1000 hay: " + mayor_1000 +
                           "\nLa suma es: " + suma;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
