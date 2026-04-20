//8. Ingresar un Nº entero cualquiera y determinar cuántas cifras tiene (todo en base 10)

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero cualquiera: ");
        int num = scanner.nextInt();
        scanner.close();
    }
}
