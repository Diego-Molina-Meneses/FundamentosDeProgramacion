package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio6_cuadrodialogo {
     public static void main(String[] args) {
        
        int parcial1, parcial2, parcial3, resultado;

        parcial1 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce la calificacion del parcial 1:")
        );

        parcial2 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce la calificacion del parcial 2:")
        );

        parcial3 = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce la calificacion del parcial 3:")
        );

        resultado = (parcial1 + parcial2 + parcial3) / 3;

        if (resultado >= 7) {
            JOptionPane.showMessageDialog(null, "Alumno Acreditado");
        } else {
            JOptionPane.showMessageDialog(null, "Alumno No Acreditado");
        }
    }
}
