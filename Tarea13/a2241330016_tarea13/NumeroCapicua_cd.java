package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class NumeroCapicua_cd {
     public static void main(String[] args) {

        int num;
        int dm, um, c, d, u;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca un numero entre 0 y 99,999:")
        );

        u = num % 10;
        num = num / 10;

        d = num % 10;
        num = num / 10;

        c = num % 10;
        num = num / 10;

        um = num % 10;
        num = num / 10;

        dm = num;

        if (dm == u && um == d)
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        else
            JOptionPane.showMessageDialog(null, "El numero NO es capicua");

        System.exit(0);
    }
}
