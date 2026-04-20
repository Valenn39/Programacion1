//5. Leer 2 valores y mostrar el mayor de ellos, si son iguales mostrar cualquiera de los dos.

import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el primer numero de los dos: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero de los dos: ");
        double num2 = scanner.nextDouble(); 
        if ( num1 > num2){ 
            System.out.println("El primer numero es mayor ");
        } 
        else if ( num2 > num1){
            System.out.println("El segundo numero es mayor ");

        }
        scanner.close();
    }    
}
