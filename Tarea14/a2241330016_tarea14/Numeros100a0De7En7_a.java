package a2241330016_tarea14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Numeros100a0De7En7_a {
    public static void main(String[] args) throws IOException {
        /*Inicializamos la i a 100
	mientras la i sea mayor o igual a 0
	y en cada vuelta del for la i se decrementa en 7*/
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
        /*el for al llevar una sola una sola intruccion en su cuerpo de ejecucion
	no precisa llaves ()*/
    }
}
