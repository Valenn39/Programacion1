// 1. Ingresar un valor en mm y convertirlo a pulgadas (Dato: 1" = 25,4 mm). 

import java.util.Scanner;

public class Ejercicios1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float datoPulgadas = 25.4f;
        System.out.println("Ingrese un numero en milimetros: ");
        float mm = scanner.nextFloat();
        float pulgadas = mm / datoPulgadas;
        System.out.printf("El numero en pulgadas es: %.2f", pulgadas);
        
        scanner.close();
    }
}