package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio_8_2_mc_cuadrodialogo {
     public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 1:")
        );

        b = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 2:")
        );

        c = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese lado 3:")
        );

        if (a == b && b == c)
            JOptionPane.showMessageDialog(null, "Es triangulo equilatero");
        else if (a == b || a == c || b == c)
            JOptionPane.showMessageDialog(null, "Es triangulo isosceles");
        else
            JOptionPane.showMessageDialog(null, "Es triangulo escaleno");
    }
}
