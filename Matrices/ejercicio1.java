package Matrices;
public class ejercicio1 {
    public static void main(String[] args) {
       
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sumatoria = 0;
        for (int num : numeros) {
            sumatoria += num;
        }
        System.out.println("La sumatoria de los valores es: " + sumatoria);
    }
}