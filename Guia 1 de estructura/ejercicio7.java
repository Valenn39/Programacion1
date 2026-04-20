//7. Ingresar 3 valores enteros, escribirlos primero en el orden que fueron ingresados y luego mostrarlos
//ordenarlos en forma creciente. 

import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] args){
            System.out.println("Ingrese el primer numero entero: ");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero entero: ");
                int num2 = scanner.nextInt();
            System.out.println("Ingrese el tercer numero entero: ");
                int num3 = scanner.nextInt();
            System.out.println("Los numeros ingresados son: " + num1 + ", " + num2 + ", " + num3);

            if (num1 <= num2 && num1 <= num3) {
                if (num2 <= num3) {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num1 + ", " + num2 + ", " + num3);
                } else {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num1 + ", " + num3 + ", " + num2);
                }
            } else if (num2 <= num1 && num2 <= num3) {
                if (num1 <= num3) {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num2 + ", " + num1 + ", " + num3);
                } else {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num2 + ", " + num3 + ", " + num1);
                }
            } else {
                if (num1 <= num2) {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num3 + ", " + num1 + ", " + num2);
                } else {
                    System.out.println("Los numeros ordenados en forma creciente son: " + num3 + ", " + num2 + ", " + num1);
                }
            }
            scanner.close();        
    }
    
}
