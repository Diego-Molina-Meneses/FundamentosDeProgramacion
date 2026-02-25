package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class CantidadCifras_cd {
    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca un numero entre 0 y 99,999:")
        );

        if (num < 10)
            JOptionPane.showMessageDialog(null, "Tiene 1 cifra");
        else if (num < 100)
            JOptionPane.showMessageDialog(null, "Tiene 2 cifras");
        else if (num < 1000)
            JOptionPane.showMessageDialog(null, "Tiene 3 cifras");
        else if (num < 10000)
            JOptionPane.showMessageDialog(null, "Tiene 4 cifras");
        else if (num < 100000)
            JOptionPane.showMessageDialog(null, "Tiene 5 cifras");

        System.exit(0);
    }
}
