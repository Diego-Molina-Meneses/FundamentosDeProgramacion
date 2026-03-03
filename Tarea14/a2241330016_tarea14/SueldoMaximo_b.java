package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class SueldoMaximo_b {
    public static void main(String[] args) {

        int sueldo;
        int sueldo_max = 0;
        int n;

        n = Integer.parseInt(
                JOptionPane.showInputDialog("Numero de sueldos:")
        );

        int i = 1;

        while (i <= n) {

            sueldo = Integer.parseInt(
                    JOptionPane.showInputDialog("Introduce sueldo:")
            );

            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }

            i++;
        }

        JOptionPane.showMessageDialog(null,
                "El sueldo maximo es: " + sueldo_max);
    }
}
