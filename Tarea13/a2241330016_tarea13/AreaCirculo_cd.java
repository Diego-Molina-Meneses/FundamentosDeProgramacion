package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class AreaCirculo_cd {
      public static void main(String[] args) {

        double r, a;

        r = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de un circulo:"));

        a = Math.PI * (r * r);  // también puede ser Math.pow(r, 2)

        JOptionPane.showMessageDialog(null,
                "El area de una circunferencia de radio " + r + " es: " + a);

        System.exit(0);
    }
}
