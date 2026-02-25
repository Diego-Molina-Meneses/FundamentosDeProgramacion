package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class DescomponerNumero_cd {
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

        JOptionPane.showMessageDialog(null,
                "dm = " + dm +
                "\num = " + um +
                "\nc = " + c +
                "\nd = " + d +
                "\nu = " + u);

        System.exit(0);
    }
}
