//2- Desarrolle una función que reciba un número entero y devuelva true si es par y false
//si es impar.
//Ejemplo:
//Entrada: 7 → Salida: El número 7 es impar


import java.util.Scanner;


public class ej2 {
  public static void main (String[] arg) { 
    Scanner sc = new Scanner ( System.in);
    System.out.println("Ingrese un numero entero: ");
        
        int num = sc.nextInt();

        boolean result = par(num);
        
        System.out.printf("El numero %d es par? %b", num, result);

        sc.close();
        }  
    public static boolean par(int num ){
        return num % 2 == 0 ; 
    }
}
