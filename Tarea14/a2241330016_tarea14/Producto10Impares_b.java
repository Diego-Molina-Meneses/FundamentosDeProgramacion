package a2241330016_tarea14;
import javax.swing.JOptionPane;
public class Producto10Impares_b {
     public static void main(String[] args) {

        long producto = 1;
        int i = 1;
        int contador = 0;

        while (contador < 10) {

            producto *= i;
            i += 2;      // siguiente impar
            contador++;  // contamos 10 impares
        }

        JOptionPane.showMessageDialog(null,
                "El producto de los 10 primeros impares es: " + producto);
    }
}
