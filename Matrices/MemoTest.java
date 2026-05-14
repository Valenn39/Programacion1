package Matrices;
import java.util.Scanner;

public class MemoTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char letras[] = {'A', 'B', 'C', 'D', 'E', 'B', 'C', 'A', 'D', 'E'};
        boolean visibles[] = new boolean[10];

        int contador = 0;

        while (contador < 5) {

            System.out.println();

            // Mostrar tablero
            for (int i = 0; i < letras.length; i++) {

                if (visibles[i] == true) {
                    System.out.print(letras[i] + " ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();

            // Pedir posiciones
            System.out.print("Ingrese primera posicion: ");
            int p1 = sc.nextInt();

            System.out.print("Ingrese segunda posicion: ");
            int p2 = sc.nextInt();

            System.out.println();

            for (int i = 0; i < letras.length; i++) {

                if (i == p1 || i == p2 || visibles[i] == true) {
                    System.out.print(letras[i] + " ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println();

            // Comparar
            if (letras[p1] == letras[p2] && p1 != p2) {

                System.out.println("Par encontrado");

                visibles[p1] = true;
                visibles[p2] = true;

                contador++;

            } else {

                System.out.println("No coinciden");
            }
        }

        System.out.println("\nJuego terminado");
    }
}