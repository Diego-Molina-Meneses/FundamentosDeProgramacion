package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class OrdenarTresNumeros_cd {
     public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca primer numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo numero:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca tercer numero:"));

        if (a > b && b > c)
            JOptionPane.showMessageDialog(null, a + ", " + b + ", " + c);
        else if (a > c && c > b)
            JOptionPane.showMessageDialog(null, a + ", " + c + ", " + b);
        else if (b > a && a > c)
            JOptionPane.showMessageDialog(null, b + ", " + a + ", " + c);
        else if (b > c && c > a)
            JOptionPane.showMessageDialog(null, b + ", " + c + ", " + a);
        else if (c > a && a > b)
            JOptionPane.showMessageDialog(null, c + ", " + a + ", " + b);
        else
            JOptionPane.showMessageDialog(null, c + ", " + b + ", " + a);

        System.exit(0);
    }
}
