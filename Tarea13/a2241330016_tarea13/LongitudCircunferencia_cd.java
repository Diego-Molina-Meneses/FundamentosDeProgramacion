package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class LongitudCircunferencia_cd {
    public static void main(String[] args) {

        double r, l;

        r = Double.parseDouble(
                JOptionPane.showInputDialog("Introduce el radio de una circunferencia:")
        );

        l = 2 * Math.PI * r;

        JOptionPane.showMessageDialog(null,
                "La longitud de una circunferencia de radio " + r + " es: " + l);

        System.exit(0);
    }
}
