package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class TablaMultiplicar_b {
    public static void main(String[] args) {

        int num;

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce numero (de 0 a 10):")
        );

        while (num < 0 || num > 10) {
            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Numero invalido.\nIntroduce numero (0 a 10):")
            );
        }

        String resultado = "Tabla del " + num + "\n";

        int i = 1;
        while (i <= 10) {
            resultado += num + " x " + i + " = " + (num * i) + "\n";
            i++;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
