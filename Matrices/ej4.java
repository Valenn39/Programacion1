package Matrices;
import java.util.Scanner;
public class ej4 {

    public static void cargarVector(int[] vec) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vec.length; i++) {

            int num;

            while (true) {
                System.out.print("Ingrese el elemento [" + i + "]: ");
                num = sc.nextInt();

                if (i == 0) {
                    break;
                }

                if (num > vec[i - 1]) {
                    break;
                } else {
                    System.out.println("ERROR: el número debe ser mayor que "+ vec[i - 1]);
                }
            }

            vec[i] = num;
        }
    }

     public static void maximaDiferencia(int[] vec) {4

        int maxDif = vec[1] - vec[0];
        int indice1 = 0;
        int indice2 = 1;

        for (int i = 0; i < vec.length - 1; i++) {

            int diferencia = vec[i + 1] - vec[i];

            if (diferencia > maxDif) {
                maxDif = diferencia;
                indice1 = i;
                indice2 = i + 1;
            }
        }

        System.out.println("\nLa máxima diferencia es: " + maxDif);
        System.out.println("Se produce entre los elementos "
                + indice1 + " y " + indice2);
    }

    public static void main(String[] args) {

        int[] vector = new int[8];

        cargarVector(vector);

        maximaDiferencia(vector);
    }

   
}