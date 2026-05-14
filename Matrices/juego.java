package Matrices;

import java.util.Scanner;

public class juego {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'B', 'C', 'A', 'D', 'E'};
        boolean[] encontradas = new boolean[10]; 
        int parEncontradas = 0; 

         while (parEncontrados < 5) {

            // Mostrar tablero
            System.out.println("\nTABLERO:");
 
            for (int i = 0; i < letras.length; i++) {

                if (encontradas[i]) {
                    System.out.print(letras[i] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            
            System.out.println("\n");
    }
    
}
