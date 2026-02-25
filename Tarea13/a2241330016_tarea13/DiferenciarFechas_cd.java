package a2241330016_tarea13;
import javax.swing.JOptionPane;
public class DiferenciarFechas_cd {
     public static void main(String[] args) {

        int dia1, mes1, ano1;
        int dia2, mes2, ano2;
        int total_dias;

        JOptionPane.showMessageDialog(null, "Fecha 1");
        dia1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        JOptionPane.showMessageDialog(null, "Fecha 2");
        dia2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca dia:"));
        mes2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca mes:"));
        ano2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca ano:"));

        total_dias = dia2 - dia1 + 30 * (mes2 - mes1) + 365 * (ano2 - ano1);

        JOptionPane.showMessageDialog(null, "Dias de diferencia: " + total_dias);

        System.exit(0);
    }
}
