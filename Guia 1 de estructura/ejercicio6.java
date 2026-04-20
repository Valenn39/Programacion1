//Ingresar tres valores enteros que representan los valores de cada lado de un triángulo. Determinar e
//informar si el triángulo es equilátero (3 lados iguales), isósceles (2 lados iguales), o escaleno (3 lados
//distinto).

import java.util.Scanner; 

public class ejercicio6{ 
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer lado del triángulo: ");

        int lado1 = scanner.nextInt();
        System.out.println("Ingrese el valor del segundo lado del triángulo: ");

        int lado2 = scanner.nextInt();
        System.out.println("Ingrese el valor del tercer lado del triángulo: ");

        int lado3 = scanner.nextInt();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }

        scanner.close();


    }
}
