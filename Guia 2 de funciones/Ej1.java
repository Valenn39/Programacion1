//1- Desarrolle una función que reciba un número entero y devuelva su cuadrado.

import java.util.Scanner;

public class Ej1{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para que te devuelva su cuadrado: ");
            double num = sc.nextDouble();
             System.out.printf("El cuadrado de %.2f es %.4f", num, cuadrado(num));
               
            sc.close(); 
            }
            public static double cuadrado(double num){
                return num * num; 
            }
}