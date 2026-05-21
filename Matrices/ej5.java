package Matrices;


public class ej5 {

    public static void main(String[] args) {

        // Vector cargado en la declaración
        int[] vec = {6, 1, 3, 7, 9, 4, 10, 2, 8, 5};

        encontrarMayores(vec);
    }

    public static void encontrarMayores(int[] vec) {

        // Precondición
        if (vec.length < 2) {
            System.out.println("El vector debe tener al menos 2 elementos.");
            return;
        }

        int max1 = vec[0];
        int pos1 = 0;

        int max2 = vec[1];
        int pos2 = 1;

        if (max2 > max1) {
            int aux = max1;
            max1 = max2;
            max2 = aux;

            int auxPos = pos1;
            pos1 = pos2;
            pos2 = auxPos;
        }

      for (int i = 2; i < vec.length; i++) {

            if (vec[i] > max1) {

                max2 = max1;
                pos2 = pos1;

                max1 = vec[i];
                pos1 = i;

            } else if (vec[i] > max2) {

                max2 = vec[i];
                pos2 = i;
            }
        }

        System.out.println("El máximo es " + max1 + " en la posición " + pos1);
        System.out.println("El segundo máximo es " + max2 + " en la posición " + pos2);
    }
}
