package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class CompararNumerosCompleto_cd {
     public static void main(String[] args) {

        int n1, n2;

        n1 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero:")
        );

        n2 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce otro numero:")
        );

        if (n1 == n2)
            JOptionPane.showMessageDialog(null, "Son iguales");
        else
            if (n1 > n2)
                JOptionPane.showMessageDialog(null, n1 + " es mayor que " + n2);
            else
                JOptionPane.showMessageDialog(null, n2 + " es mayor que " + n1);

        System.exit(0);
    }
}
