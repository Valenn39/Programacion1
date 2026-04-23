//4- Desarrolle una función que reciba un número entero no negativo y devuelva su
//factorial.
//Ejemplo:
//Entrada: 5 → Salida: 120 (5×4×3×2×1)
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero no negativo: ");
        int numPos = sc.nextInt();
        long factorial = 1; 
        for(int i= 1; i <= numPos; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + numPos + "es: " + factorial);
        sc.close();   
    }
}
