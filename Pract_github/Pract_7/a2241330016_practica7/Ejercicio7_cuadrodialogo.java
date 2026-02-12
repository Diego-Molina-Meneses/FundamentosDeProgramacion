package a2241330016_practica7;
import javax.swing.JOptionPane;
public class Ejercicio7_cuadrodialogo {
     public static void main(String[] args) {
        
        int dia;

        dia = Integer.parseInt(
                JOptionPane.showInputDialog("Introduce un numero del 1 al 7:")
        );

        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "Es Lunes");
        } else {
            if (dia == 2) {
                JOptionPane.showMessageDialog(null, "Es Martes");
            } else {
                if (dia == 3) {
                    JOptionPane.showMessageDialog(null, "Es Miercoles");
                } else {
                    if (dia == 4) {
                        JOptionPane.showMessageDialog(null, "Es Jueves");
                    } else {
                        if (dia == 5) {
                            JOptionPane.showMessageDialog(null, "Es Viernes");
                        } else {
                            if (dia == 6) {
                                JOptionPane.showMessageDialog(null, "Es Sabado");
                            } else {
                                if (dia == 7) {
                                    JOptionPane.showMessageDialog(null, "Es Domingo");
                                } else {
                                    JOptionPane.showMessageDialog(null, "No Existe");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
