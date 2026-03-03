package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class Numeros100a0De7En7_b {
    public static void main(String[] args) {
         /*Inicializamos la i a 100
	mientras la i sea mayor o igual a 0
	y en cada vuelta del for la i se decrementa en 7*/
        int i = 100;

        while (i >= 0) {
            JOptionPane.showMessageDialog(null, i);
            i -= 7;
        }
        /*el for al llevar una sola una sola intruccion en su cuerpo de ejecucion
	no precisa llaves ()*/
    }
}
