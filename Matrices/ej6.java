package Matrices; 
import java.util.Scanner;

public class ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vec = new int[8];
        for (int i = 0; i < vec.length; i++) {

            int num;

            do {
                System.out.print("Ingrese un valor para la posición " + i + ": ");
                num = teclado.nextInt();

                if (buscar(vec, i, num)) {
                    System.out.println("El número ya existe. Ingrese otro.");
                }

            } while (buscar(vec, i, num));

            vec[i] = num;
        }

        System.out.println("\nVector cargado:");

        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }

        teclado.close();
    }

    public static boolean buscar(int[] vec, int limite, int valor) {

        for (int i = 0; i < limite; i++) {

            if (vec[i] == valor) {
                return true;
            }
        }

        return false;
    }
}