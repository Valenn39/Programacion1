//9. Ingresar un Nº cualquiera y determinar si es positivo o no. Repetir en un ciclo hasta que el nro ingresado
//sea cero.

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " no es positivo.");
            }
        } while (numero != 0);
        System.out.println("Programa finalizado.");
        scanner.close();
    }

    
}
