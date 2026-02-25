package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class NumeroCapicuaCompleto_cd {
    public static void main(String[] args) {

        int num;
        int dm, um, c, d, u;
        boolean capicua = false;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduzca un numero entre 0 y 99,999:")
        );

        u = num % 10; num = num / 10;
        d = num % 10; num = num / 10;
        c = num % 10; num = num / 10;
        um = num % 10; num = num / 10;
        dm = num;

        if (dm != 0 && dm == u && um == d)
            capicua = true;

        if (dm == 0 && um != 0 && um == u && c == d)
            capicua = true;

        if (dm == 0 && um == 0 && c != 0 && c == u)
            capicua = true;

        if (dm == 0 && um == 0 && c == 0 && d != 0 && d == u)
            capicua = true;

        if (capicua)
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        else
            JOptionPane.showMessageDialog(null, "El numero NO es capicua");

        System.exit(0);
    }
}
