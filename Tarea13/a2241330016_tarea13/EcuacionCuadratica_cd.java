package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class EcuacionCuadratica_cd {
    public static void main(String[] args) {

        double a, b, c, d, x1, x2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Introduce primer coeficiente (a):"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Introduce segundo coeficiente (b):"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Introduce tercer coeficiente (c):"));

        d = (b * b) - (4 * a * c);

        if (d < 0) {
            JOptionPane.showMessageDialog(null, "No existen soluciones reales");
        } else {
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);

                JOptionPane.showMessageDialog(null,
                        "Solucion 1: " + x1 +
                        "\nSolucion 2: " + x2);
            }
        }

        System.exit(0);
    }
    
}
