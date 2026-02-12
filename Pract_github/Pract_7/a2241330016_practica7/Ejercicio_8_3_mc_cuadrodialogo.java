package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio_8_3_mc_cuadrodialogo {
     public static void main(String[] args) {

        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 1:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 2:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese lado 3:"));

        // IF ANIDADOS
        if (a == b) {
            if (b == c) {
                JOptionPane.showMessageDialog(null, "Es triangulo equilatero");
            } else {
                JOptionPane.showMessageDialog(null, "Es triangulo isosceles");
            }
        } else {
            if (a == c) {
                JOptionPane.showMessageDialog(null, "Es triangulo isosceles");
            } else {
                if (b == c) {
                    JOptionPane.showMessageDialog(null, "Es triangulo isosceles");
                } else {
                    JOptionPane.showMessageDialog(null, "Es triangulo escaleno");
                }
            }
        }
    }
}
